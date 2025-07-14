package com.seguramais.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@EqualsAndHashCode
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClienteResponse {
    private final String nome;
    private final String email;
    private final String telefone;
    private final LocalDate dataNascimento;
    private final DocumentoResponse documento;
    private final List<EnderecoResponse> enderecos;
}
