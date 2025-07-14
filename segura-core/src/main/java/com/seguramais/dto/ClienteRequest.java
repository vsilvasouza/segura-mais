package com.seguramais.dto;

import com.seguramais.model.Documento;
import com.seguramais.model.Endereco;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class ClienteRequest {

    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
    private DocumentoRequest documento;
    private List<EnderecoRequest> enderecos;

}
