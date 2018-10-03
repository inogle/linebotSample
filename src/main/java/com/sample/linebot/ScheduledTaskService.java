package com.sample.linebot;

import java.net.URISyntaxException;
import java.util.Date;
import java.util.concurrent.ExecutionException;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.linecorp.bot.model.message.TextMessage;
import com.sample.weatherforcast.ForcastPrecipProbabilityService;

//@Slf4j
@Service
public class ScheduledTaskService {
	
	
    @Scheduled(cron="${cron.cron4}", zone = "Asia/Tokyo")
    public void scheduledAlarm() throws URISyntaxException, InterruptedException, ExecutionException {
    	String rainRate = getRainProbability();
    	
    	//プッシュする処理を呼び出す
		System.out.println("MYLOG: execute alart" + new Date());
		
		PushConfirmController controller = new PushConfirmController();
    	
    	if((StringUtils.isEmpty(rainRate))) {
    		controller.pushAlarm("unknown");
    		System.out.println("MYLOG: failed to get rain propability");
    		return;
    	}
		
		if(Integer.valueOf(rainRate) < 30) {
			System.out.println("MYLOG: precip propability is lower. non alert" + new Date());
			return;
		}
		
		controller.pushAlarm(rainRate);
		System.out.println("MYLOG: finish alart" + new Date());
    }
    
    public TextMessage executeAlarm() {
    	String rainRate = getRainProbability();
		return new TextMessage("今日の降水確率は" + rainRate + "%だよ！");
    }

	private String getRainProbability() {
		ForcastPrecipProbabilityService precipPribabilityService = new ForcastPrecipProbabilityService();
    	String precipPribability = null;
    	try {
			precipPribability = precipPribabilityService.getTodayPrecipProbability();
		} catch (JsonProcessingException e) {
			System.out.println("MYLOG: failed to get rain propability");
		}
		return precipPribability;
	}
}