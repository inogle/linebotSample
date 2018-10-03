package com.sample.linebot;

import java.net.URISyntaxException;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.linecorp.bot.model.message.TextMessage;
import com.sample.rainforcast.ForcastPrecipProbabilityService;

//@Slf4j
@Service
public class ScheduledTaskService {
	
	
    @Scheduled(cron="${cron.cron4}", zone = "Asia/Tokyo")
    public void scheduledAlarm() throws URISyntaxException {
    	String rainRate = getRainProbability();
    	
    	//プッシュする処理を呼び出す
		System.out.println("MYLOG: start execute alarm");
//		LineMessagingClient client = 
//				new LineMessagingClientBuilder("lLt3OgiwUVo9gnfUkL2PK+DJDutDdEjFqqUEdTRr26bm505diQhqiPX5EEdPMdk3fLWgx9S47UhDkNrt5nW4ar7WsN54eye4QXDC1t/QHxEsgExb/e9Q9hPZ70/oIXhEs4W952/aTwXCj9ZHpL0brgdB04t89/1O/w1cDnyilFU=")
//				.build();
//		PushConfirmController controller = new PushConfirmController(client);
		
		PushConfirmController controller = new PushConfirmController();
    	
    	if((StringUtils.isEmpty(rainRate))) {
    		controller.pushAlarm("unknown");
    		return;
    	}
		
		if(Integer.valueOf(rainRate) < 30) return;
		
		controller.pushAlarm(rainRate);
    }
    
    public TextMessage executeAlarm() {
    	String rainRate = getRainProbability();
		return new TextMessage("今日の降水確率は" + rainRate + "%だよ！");
    }

	private String getRainProbability() {
		ForcastPrecipProbabilityService rainRateClient = new ForcastPrecipProbabilityService();
    	String rainRate = null;
    	try {
			rainRate = rainRateClient.getTodayPrecipProbability();
		} catch (JsonProcessingException e) {
			System.out.println("MYLOG: failed to get rain pripability");
		}
		return rainRate;
	}
}