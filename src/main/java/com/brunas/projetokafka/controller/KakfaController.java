package com.brunas.projetokafka.controller;

import com.brunas.projetokafka.teste.ProdutorTopicoService;
import com.brunas.projetokafka.teste2.ProdutorTopico2Service;
import com.brunas.projetokafka.teste3.ProdutorTopico3Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KakfaController {

    private final ProdutorTopicoService produtorTopicoService;
    private final ProdutorTopico2Service produtorTopico2Service;
    private final ProdutorTopico3Service produtorTopico3Service;

    public KakfaController(final ProdutorTopicoService produtorTopicoService,
                           final ProdutorTopico2Service produtorTopico2Service,
                           final ProdutorTopico3Service produtorTopico3Service) {
        this.produtorTopicoService = produtorTopicoService;
        this.produtorTopico2Service = produtorTopico2Service;
        this.produtorTopico3Service = produtorTopico3Service;
    }

    @PostMapping(value = "/teste")
    public void teste(@RequestBody String mensagem) {
        produtorTopicoService.sendMessage(mensagem);
    }

    @PostMapping(value = "/teste2")
    public void teste2(@RequestBody String mensagem) {
        produtorTopico2Service.sendMessage(mensagem);
    }

    @PostMapping(value = "/teste3")
    public void teste3(@RequestBody String mensagem) { produtorTopico3Service.sendMessage(mensagem);
    }

}
