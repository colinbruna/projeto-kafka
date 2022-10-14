package com.brunas.projetokafka.teste3;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProdutorTopico3Service {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public ProdutorTopico3Service(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String mensagem) {
        System.out.println("Produtor, envia: " + mensagem);
        this.kafkaTemplate.send("topico3", mensagem);
    }
}
