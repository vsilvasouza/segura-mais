package com.seguramais.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    /**
     * Endpoint para cadastrar um cliente.
     *
     * @return Mensagem de sucesso.
     */
    @PostMapping
    public String cadastrarCliente() {
        return "Cliente criado com sucesso!";
    }
}
