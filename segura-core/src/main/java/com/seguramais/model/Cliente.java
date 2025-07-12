package com.seguramais.model;

import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {

    private UUID id = UUID.randomUUID();

    private String nome;

    private String email;

    private Documento documento;

    private LocalDate dataNascimento;

    private String telefone;

    private List<Endereco> enderecos;

}
