package com.seguramais.usecase;

import com.seguramais.dto.ClienteRequest;
import com.seguramais.mapper.ClienteMapper;
import com.seguramais.model.Cliente;
import com.seguramais.ports.in.CadastrarClienteUseCase;
import com.seguramais.ports.out.ClienteRepository;

public class CadastrarClienteService implements CadastrarClienteUseCase {

    private final ClienteRepository clienteRepository;

    public CadastrarClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente cadastrar(ClienteRequest clienteRequest) {

        return clienteRepository.salvar(Cliente.builder()
                .nome(clienteRequest.getNome())
                .email(clienteRequest.getEmail())
                .documento(ClienteMapper.toDocumento(clienteRequest.getDocumento()))
                .enderecos(clienteRequest.getEnderecos().stream()
                        .map(ClienteMapper::toEndereco)
                        .toList())
                .dataNascimento(clienteRequest.getDataNascimento())
                .telefone(clienteRequest.getTelefone())
                .build());
    }
}
