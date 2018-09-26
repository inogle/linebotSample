package com.sample.linebot;

import java.net.URISyntaxException;
import java.text.SimpleDateFormat;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

//@Slf4j
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(cron="${cron.cron3}", zone = "Asia/Tokyo")
    public void executeAlarm() throws URISyntaxException {
        //プッシュする処理を呼び出す
		pushAlarm();
    }

	private void pushAlarm() {
		// TODO Auto-generated method stub
		System.out.println("schedule execute");
		
	}
}