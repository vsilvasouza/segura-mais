package com.seguramais.dto;

import com.seguramais.model.TipoDocumento;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@EqualsAndHashCode
@AllArgsConstructor
@Setter
public class DocumentoRequest {
    private String numero;
    private TipoDocumento tipo;
}
