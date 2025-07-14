package com.seguramais.model;

import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@EqualsAndHashCode
@Builder
@Getter
@ToString
public class Cliente {

    private final UUID id = UUID.randomUUID();

    private final String nome;

    private final String email;

    private final Documento documento;

    private final LocalDate dataNascimento;

    private final String telefone;

    private final List<Endereco> enderecos;

}
