package com.away1994.idlerest.websocket;

import com.away1994.idlerest.Greeting;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import java.util.Map;

@Controller
public class WebsocketController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(String message, SimpMessageHeaderAccessor headerAccessor) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(headerAccessor.getSessionAttributes().get("project").toString()) + "!");
//        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message) + "!");
    }
}
