package com.example.Springbootkafka.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;
    

    public void sendMessageToTopic(String topic, String message) {
        try {
            kafkaTemplate.send(topic, message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
