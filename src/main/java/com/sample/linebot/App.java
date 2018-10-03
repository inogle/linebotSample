package com.sample.linebot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.linecorp.bot.model.event.Event;
import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;

@SpringBootApplication
@LineMessageHandler
@EnableScheduling
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        System.out.println("MY_LOG:hello-line!!");
    }

    @EventMapping
    public TextMessage handleTextMessageEvent(MessageEvent<TextMessageContent> event) {
        System.out.println("MY_LOG:event: " + event);
        if("天気".equals(event.getMessage().getText())) {
        	ScheduledTaskService sevices = new ScheduledTaskService();
        	return sevices.executeAlarm();
        }
        if("いいえ".equals(event.getMessage().getText()))
        	return new TextMessage("持てや");
        if("はい".equals(event.getMessage().getText()))
        	return new TextMessage("それで良い");
        
        return new TextMessage(event.getMessage().getText() + " : thanks!");
    }

    @EventMapping
    public void handleDefaultMessageEvent(Event event) {
        System.out.println("MY_LOG:defaultevent: " + event);
    }
}
