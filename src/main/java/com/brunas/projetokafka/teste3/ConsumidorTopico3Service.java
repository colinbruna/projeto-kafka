package com.brunas.projetokafka.teste3;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ConsumidorTopico3Service {

    // Deve receber a mensagem o consumer do grupo 3 e um consumer do grupo 2

    @KafkaListener(topics = "topico3", groupId = "grupo2")
    public void consumidor1(String mensagem) {
        System.out.println(KafkaUtils.getConsumerGroupId() + " | Consumidor1, recebe: " + mensagem + LocalDate.now());
    }

    @KafkaListener(topics = "topico3", groupId = "grupo2")
    public void consumidor2(String mensagem) {
        System.out.println(KafkaUtils.getConsumerGroupId() + " | Consumidor2, recebe: " + mensagem + LocalDate.now());
    }

    @KafkaListener(topics = "topico3", groupId = "grupo3")
    public void consumidor3(String mensagem) {
        System.out.println(KafkaUtils.getConsumerGroupId() + " | Consumidor3, recebe: " + mensagem + LocalDate.now());
    }

}
