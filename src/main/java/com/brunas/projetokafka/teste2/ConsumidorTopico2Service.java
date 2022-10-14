package com.brunas.projetokafka.teste2;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ConsumidorTopico2Service {

    //  Mesmo tópico e grupos iguais: somente um do grupo recebe a mensagem

    @KafkaListener(topics = "topico2", groupId = "grupo1")
    public void consumidor1(String mensagem) {
        System.out.println(KafkaUtils.getConsumerGroupId() + " | Consumidor1, recebe: " + mensagem + LocalDate.now());
    }

    @KafkaListener(topics = "topico2", groupId = "grupo1")
    public void consumidor2(String mensagem) {
        System.out.println(KafkaUtils.getConsumerGroupId() + " | Consumidor2, recebe: " + mensagem + LocalDate.now());
    }

    @KafkaListener(topics = "topico2", groupId = "grupo1")
    public void consumidor3(String mensagem) {
        System.out.println(KafkaUtils.getConsumerGroupId() + " | Consumidor3, recebe: " + mensagem + LocalDate.now());
    }

}
