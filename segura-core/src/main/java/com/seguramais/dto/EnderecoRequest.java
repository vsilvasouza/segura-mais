package com.seguramais.dto;

import com.seguramais.model.UF;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class EnderecoRequest {
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private UF estado;
    private String cep;
}
