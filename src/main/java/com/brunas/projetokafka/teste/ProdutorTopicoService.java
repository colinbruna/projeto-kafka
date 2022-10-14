package com.brunas.projetokafka.teste;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProdutorTopicoService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public ProdutorTopicoService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String mensagem) {
        System.out.println("Produtor, envia: " + mensagem);
        this.kafkaTemplate.send("topico", mensagem);
    }
}
