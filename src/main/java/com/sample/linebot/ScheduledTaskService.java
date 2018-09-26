package com.sample.linebot;

import java.net.URISyntaxException;
import java.text.SimpleDateFormat;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.linecorp.bot.client.LineMessagingClient;
import com.linecorp.bot.client.LineMessagingClientBuilder;

//@Slf4j
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(cron="${cron.cron3}", zone = "Asia/Tokyo")
    public void executeAlarm() throws URISyntaxException {
        //プッシュする処理を呼び出す
    	System.out.println("MYLOG: start execute alarm");
    	LineMessagingClientBuilder builder = new LineMessagingClientBuilder("DJDutDdEjFqqUEdTRr26bm505diQhqiPX5EEdPMdk3fLWgx9S47UhDkNrt5nW4ar7WsN54eye4QXDC1t/QHxEsgExb/e9Q9hPZ70/oIXhEs4W952/aTwXCj9ZHpL0brgdB04t89/1O/w1cDnyilFU=");
    	LineMessagingClient client = builder.build();
    	PushConfirmController controller = new PushConfirmController(client);
    	System.out.println("MYLOG: built client");
    	controller.pushAlarm();
    }
}