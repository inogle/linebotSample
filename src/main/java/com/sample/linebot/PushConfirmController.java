package com.sample.linebot;

import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.linecorp.bot.client.LineMessagingClient;
import com.linecorp.bot.model.PushMessage;
import com.linecorp.bot.model.action.MessageAction;
import com.linecorp.bot.model.message.TemplateMessage;
import com.linecorp.bot.model.message.template.ConfirmTemplate;
import com.linecorp.bot.model.response.BotApiResponse;

@RestController
public class PushConfirmController {

    private LineMessagingClient lineMessagingClient;

    public PushConfirmController(LineMessagingClient lineMessagingClient) {
        this.lineMessagingClient = lineMessagingClient;
    }

    //リマインドをプッシュ
    @GetMapping("alarm")
    public void pushAlarm() throws URISyntaxException {

        try {
            BotApiResponse response = lineMessagingClient
                                            .pushMessage(new PushMessage("inogle",
                                                         new TemplateMessage("明日は燃えるごみの日だよ！",
                                                                 new ConfirmTemplate("ごみ捨ては終わった？",
                                                                         new MessageAction("はい", "はい"),
                                                                         new MessageAction("いいえ", "いいえ")
                                                                 )
                                                         )))
                                            .get();
            System.out.println("MYLOG: Sent messages: {}" + response);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
    
    
}