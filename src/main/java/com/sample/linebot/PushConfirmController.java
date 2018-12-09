package com.sample.linebot;

import java.util.concurrent.ExecutionException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.linecorp.bot.client.LineMessagingClient;
import com.linecorp.bot.model.PushMessage;
import com.linecorp.bot.model.action.MessageAction;
import com.linecorp.bot.model.message.TemplateMessage;
import com.linecorp.bot.model.message.template.ConfirmTemplate;
import com.linecorp.bot.model.response.BotApiResponse;
import com.sample.common.Constants;

@RestController
public class PushConfirmController {
  // TODO 住所をユーザ毎に格納出来るようにしたい
  // TODO ロジック部分テスト追加

  private LineMessagingClient lineMessagingClient;

  //リマインドをプッシュ
  @GetMapping("alarm")
     public void pushAlarm(String rainProbability) throws InterruptedException, ExecutionException {
    System.out.println("MYLOG: start pushAlarm()");
    lineMessagingClient = LineMessagingClientSingleton.getInstance().createLineMessagingClient();

        BotApiResponse response = 
        		lineMessagingClient
                    .pushMessage(new PushMessage(Constants.lineUserId,
                                 new TemplateMessage("今日の降水確率",
                                         new ConfirmTemplate("今日の降水確率は" + rainProbability + "%だよ！傘持った？",
                                                 new MessageAction("はい", "持ちました！"),
                                                 new MessageAction("いいえ", "要らんわ。")
                                         )
                                 )))
                    .get();
        System.out.println("MYLOG: end pushAlarm(). message is : " + response);
    }
}