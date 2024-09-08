package com.cartmicroservices.emailservice.kafka;

import com.cartmicroservices.basedomains.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(OrderEvent event) {
        LOGGER.info(String.format("OrderEvent received in EmailService => %s", event.toString()));

//        Send email to the customer - Not covered in this tutorial

    }
}
