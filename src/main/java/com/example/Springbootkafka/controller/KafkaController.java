package com.example.Springbootkafka.controller;


import com.example.Springbootkafka.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    ProducerService producerService;

    @GetMapping("/send/{message}")
    public String sendMessage(@PathVariable("message") String message, @Nullable @RequestParam("topic") String topic) {
        producerService.sendMessageToTopic(topic, message);
        return "done";
        
    }
}
