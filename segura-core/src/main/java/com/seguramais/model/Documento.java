package com.seguramais.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@Builder
@Getter
@ToString
public class Documento {

    @NotNull(message = "O número do documento é obrigatório!")
    @Pattern(
            regexp = "\\d{11}|\\d{14}",
            message = "O documento deve ter 11 dígitos (CPF) ou 14 dígitos (CNPJ)!"
    )
    private final String numero;

    @NotNull(message = "O tipo do documento é obrigatório!")
    private final TipoDocumento tipo;
}
