package com.brunas.projetokafka.teste;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ConsumidorTopicoService {

    //  Mesmo tópico e grupos diferentes: todos recebem as mensagens

    @KafkaListener(topics = "topico", groupId = "grupo1")
    public void consumidor1(String mensagem) {
        System.out.println(KafkaUtils.getConsumerGroupId() + " | Consumidor1, recebe: " + mensagem + LocalDate.now());
    }

    @KafkaListener(topics = "topico", groupId = "grupo2")
    public void consumidor2(String mensagem) {
        System.out.println(KafkaUtils.getConsumerGroupId() + " | Consumidor2, recebe: " + mensagem + LocalDate.now());
    }

    @KafkaListener(topics = "topico", groupId = "grupo3")
    public void consumidor3(String mensagem) {
        System.out.println(KafkaUtils.getConsumerGroupId() + " | Consumidor3, recebe: " + mensagem + LocalDate.now());
    }
}
