package com.seguramais.model;

import lombok.*;

@Getter
@EqualsAndHashCode
@AllArgsConstructor
@Builder
@ToString
public class Endereco {

    private final String rua;

    private final String numero;

    private final String complemento;

    private final String bairro;

    private final String cidade;

    private final String estado;

    private final String cep;
}
