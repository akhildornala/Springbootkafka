package com.example.Springbootkafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "testtopic1", groupId = "group1")
    public void listenToTopic(String message) {
        System.out.println("received message " + message);
    }


    @KafkaListener(topics = "testtopic1", groupId = "group2")
    public void listenToTopic2(String message) {
        System.out.println("received message group2 " + message);
    }
}
