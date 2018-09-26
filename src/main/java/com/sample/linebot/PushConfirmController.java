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
                                            .pushMessage(new PushMessage("Ue3f058707d9179ae8df54a07888dd1aa",
                                                         new TemplateMessage("今日の降水確率は1000%だよ！",
                                                                 new ConfirmTemplate("今日の降水確率は1000%だよ！傘持った？",
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

// 一応動確用CURL
//curl -X POST \
//-H 'Content-Type:application/json' \
//-H 'Authorization: Bearer lLt3OgiwUVo9gnfUkL2PK+DJDutDdEjFqqUEdTRr26bm505diQhqiPX5EEdPMdk3fLWgx9S47UhDkNrt5nW4ar7WsN54eye4QXDC1t/QHxEsgExb/e9Q9hPZ70/oIXhEs4W952/aTwXCj9ZHpL0brgdB04t89/1O/w1cDnyilFU=' \
//-d '{
//    "to": "Ue3f058707d9179ae8df54a07888dd1aa",
//    "messages":[
//        {
//        "type": "text",
//        "text": "新大陸へようこそ"
//    }
//    ]
//}' https://api.line.me/v2/bot/message/push