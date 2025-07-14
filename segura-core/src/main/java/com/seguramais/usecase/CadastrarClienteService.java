package com.seguramais.usecase;

import com.seguramais.dto.ClienteRequest;
import com.seguramais.dto.DocumentoRequest;
import com.seguramais.dto.EnderecoRequest;
import com.seguramais.model.Cliente;
import com.seguramais.model.Documento;
import com.seguramais.model.Endereco;
import com.seguramais.ports.in.CadastrarClienteUseCase;
import com.seguramais.ports.out.ClienteRepository;
import lombok.EqualsAndHashCode;

public class CadastrarClienteService implements CadastrarClienteUseCase {

    private final ClienteRepository clienteRepository;

    public CadastrarClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    private Documento toDocumento(DocumentoRequest documentoRequest) {
        return Documento.builder()
                .tipo(documentoRequest.getTipo())
                .numero(documentoRequest.getNumero())
                .build();
    }

    private Endereco toEndereco(EnderecoRequest enderecoRequest) {
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

    @Override
    public Cliente cadastrar(ClienteRequest clienteRequest) {

        return clienteRepository.salvar(Cliente.builder()
                .nome(clienteRequest.getNome())
                .email(clienteRequest.getEmail())
                .documento(toDocumento(clienteRequest.getDocumento()))
                .enderecos(clienteRequest.getEnderecos().stream()
                        .map(this::toEndereco)
                        .toList())
                .dataNascimento(clienteRequest.getDataNascimento())
                .telefone(clienteRequest.getTelefone())
                .build());
    }
}
