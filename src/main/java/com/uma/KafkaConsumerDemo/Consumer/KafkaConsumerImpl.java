package com.uma.KafkaConsumerDemo.Consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerImpl {
    @KafkaListener(topics = "uploadsheettopic", groupId = "Group1")
    public void listen(String sheetName) {
        if (sheetName.equals("hotels")) {
            System.out.println("Received '" + sheetName + "' from the uploadsheettopic. in hotels");
        }
    }
}
