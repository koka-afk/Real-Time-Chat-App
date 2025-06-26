package com.chat.app.Controllers;

import ch.qos.logback.core.model.Model;
import com.chat.app.Models.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message){
        return message;
    }


    @GetMapping("/chat")
    public String chat(){
        return "chat";
    }
}
