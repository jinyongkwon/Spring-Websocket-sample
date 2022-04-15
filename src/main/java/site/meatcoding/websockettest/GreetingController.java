package site.meatcoding.websockettest;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

    @MessageMapping("/hello") // 메세지에 /hello가 들어있으면 메서드 호출
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage msg) throws Exception {
        return new Greeting(HtmlUtils.htmlEscape(msg.getName()));
    }

}
