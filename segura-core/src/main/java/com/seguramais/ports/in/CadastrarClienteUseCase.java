package com.seguramais.ports.in;

import com.seguramais.dto.ClienteRequest;
import com.seguramais.model.Cliente;

public interface CadastrarClienteUseCase {

    Cliente cadastrar(ClienteRequest clienteRequest);
}
