package com.seguramais.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.seguramais.model.TipoDocumento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocumentoResponse {
    private final String numero;
    private final TipoDocumento tipo;
}
