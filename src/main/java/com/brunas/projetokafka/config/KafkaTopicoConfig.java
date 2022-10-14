package com.brunas.projetokafka.config;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicoConfig {

//    para criar tópicos apartir do meu produtor
    @Bean
    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> propriedades = new HashMap<>();
        propriedades.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        return new KafkaAdmin(propriedades);
    }

    @Bean
    public NewTopic topico() {
        return new NewTopic("topico", 1, Short.valueOf("1"));
    }

    @Bean
    public NewTopic topico1() {
        return new NewTopic("topico1", 3, Short.valueOf("1"));
    }

    @Bean
    public NewTopic topico2() {
        return new NewTopic("topico2", 3, Short.valueOf("1"));
    }

}
