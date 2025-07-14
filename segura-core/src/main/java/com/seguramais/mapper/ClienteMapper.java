package com.seguramais.mapper;

import com.seguramais.dto.*;
import com.seguramais.model.Cliente;
import com.seguramais.model.Documento;
import com.seguramais.model.Endereco;

public class ClienteMapper {

    private ClienteMapper() {
    }

    public static ClienteResponse toClienteResponse(Cliente cliente) {

        return ClienteResponse.builder()
                .nome(cliente.getNome())
                .email(cliente.getEmail())
                .telefone(cliente.getTelefone())
                .dataNascimento(cliente.getDataNascimento())
                .documento(toDocumentoResponse(cliente.getDocumento()))
                .enderecos(cliente.getEnderecos().stream()
                        .map(ClienteMapper::toEnderecoResponse)
                        .toList())
                .build();
    }

    private static DocumentoResponse toDocumentoResponse(Documento documento) {
        return DocumentoResponse.builder()
                .numero(documento.getNumero())
                .tipo(documento.getTipo())
                .build();
    }

    private static EnderecoResponse toEnderecoResponse(Endereco endereco) {
        return EnderecoResponse.builder()
                .rua(endereco.getRua())
                .numero(endereco.getNumero())
                .complemento(endereco.getComplemento())
                .bairro(endereco.getBairro())
                .cidade(endereco.getCidade())
                .estado(endereco.getEstado())
                .cep(endereco.getCep())
                .build();
    }

    public static Documento toDocumento(DocumentoRequest documentoRequest) {
        return Documento.builder()
                .tipo(documentoRequest.getTipo())
                .numero(documentoRequest.getNumero())
                .build();
    }

    public static Endereco toEndereco(EnderecoRequest enderecoRequest) {
        return Endereco.builder()
                .rua(enderecoRequest.getRua())
                .numero(enderecoRequest.getNumero())
                .complemento(enderecoRequest.getComplemento())
                .bairro(enderecoRequest.getBairro())
                .cidade(enderecoRequest.getCidade())
                .estado(enderecoRequest.getEstado())
                .cep(enderecoRequest.getCep())
                .build();
    }
}
