package com.example.kafkaexample;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(
            topics = "kit",
            groupId = "sampleGroupId"
    )
    void listener(String data) {
        System.out.println("Listener received: " + data + " 👂");
    }
}
