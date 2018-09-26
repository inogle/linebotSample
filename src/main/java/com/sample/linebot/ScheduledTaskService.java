package com.sample.linebot;

import java.net.URISyntaxException;
import java.text.SimpleDateFormat;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.linecorp.bot.client.LineMessagingClient;
import com.linecorp.bot.client.LineMessagingClientImpl;

//@Slf4j
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(cron="${cron.cron3}", zone = "Asia/Tokyo")
    public void executeAlarm() throws URISyntaxException {
        //プッシュする処理を呼び出す
    	LineMessagingClient client = new LineMessagingClientImpl(null);
    	PushConfirmController controller = new PushConfirmController(client);
    	controller.pushAlarm();
    }

//	private void pushAlarm() {
//		// TODO Auto-generated method stub
//		System.out.println("MYLOG: schedule execute");
//	    try {
//	        Object lineMessagingClient;
//			BotApiResponse response = lineMessagingClient
//	                                        .pushMessage(new PushMessage(properties.getTargetId(),
//	                                                     new TemplateMessage("明日は燃えるごみの日だよ！",
//	                                                             new ConfirmTemplate("ごみ捨ては終わった？",
//	                                                                     new MessageAction("はい", "はい"),
//	                                                                     new MessageAction("いいえ", "いいえ")
//	                                                             )
//	                                                     )))
//	                                        .get();
//	        System.out.println("MYLOG: Sent messages: " + response);
//	    } catch (InterruptedException | ExecutionException e) {
//	    	System.out.println("MYLOG: RuntimeException is occured");
//	        throw new RuntimeException(e);
//	    }
//	}
}