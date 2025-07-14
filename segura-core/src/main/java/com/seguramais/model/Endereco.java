package com.seguramais.model;

import jakarta.validation.constraints.Pattern;
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

    private final UF estado;

    @Pattern(regexp = "^\\d{5}-\\d{3}$", message = "CEP inválido. Formato esperado: 00000-000")
    private final String cep;
}
