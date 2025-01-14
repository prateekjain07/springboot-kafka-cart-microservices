package com.cartmicroservices.orderservice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Value("${spring.kafka.topic.name}")
    private String topicName;

    //Spring Bean for Kafka Topic
    @Bean
    public NewTopic topic() {
        return TopicBuilder.name(this.topicName)
//                .partitions(3)
                .build();
    }
}
