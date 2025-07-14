package com.seguramais.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.seguramais.model.UF;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnderecoResponse {
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private UF estado;
    private String cep;
}
