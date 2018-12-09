package com.sample.linebot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.linecorp.bot.model.event.Event;
import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@LineMessageHandler
@EnableScheduling
public class App {
  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
    System.out.println("MY_LOG:hello-line!!");
  }
  
  /**
   * Textを受け取ったら規定のメッセージを返すメソッド.
   * @param event Lineから取得するTextMessageのEvent
   * @return LineへPush通知するTextMessage
   */
  @EventMapping
  public TextMessage handleTextMessageEvent(MessageEvent<TextMessageContent> event) {
    System.out.println("MY_LOG:event: " + event);
    if ("天気".equals(event.getMessage().getText())) {
      System.out.println("MY_LOG: call getTodayPrecipProbability()");
      ScheduledTaskService sevices = new ScheduledTaskService();
      return sevices.getTodayPrecipProbability();
    }
    if ("トレース".equals(event.getMessage().getText())) {
      System.out.println("MY_LOG: call tracePrecipProbability()");
      ScheduledTaskService sevices = new ScheduledTaskService();
      return sevices.tracePrecipProbability();
    }
    if ("要らんわ。".equals(event.getMessage().getText())) {
      return new TextMessage("あっそ、勝手にして。");
    }
    if ("持ちました！".equals(event.getMessage().getText())) {
      return new TextMessage("良い心がけでちゅね。");
    }
    
    return new TextMessage(event.getMessage().getText() + " : thanks!");
  }

  @EventMapping
  public void handleDefaultMessageEvent(Event event) {
    System.out.println("MY_LOG:defaultevent: " + event);
  }
}
