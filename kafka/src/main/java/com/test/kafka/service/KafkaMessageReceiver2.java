package com.test.kafka.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.internals.Topic;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class KafkaMessageReceiver2 {
    //指定监听的topic，当前消费者组id
    @KafkaListener(topics = "test")
    public void registryReceiver(ConsumerRecord record) {
        Optional<Object> kafkaMassage = Optional.ofNullable(record.value());
        if (kafkaMassage.isPresent()) {
            Object message = kafkaMassage.get();
            System.out.println("----------------- record =" + record);
            System.out.println("------------------ message =" + message);
        }
    }


}