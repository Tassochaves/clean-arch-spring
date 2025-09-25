package com.dev.clean_arch.infra.dtos;

import java.time.LocalDateTime;

import com.dev.clean_arch.core.enums.TipoEvento;

public record EventoDto(
    Long id,
    String nome,
    String descricao,
    String identificador,
    String localEvento,
    String organizador,
    LocalDateTime dataInicio,
    LocalDateTime dataFim,

    TipoEvento tipoEvento
) {

}
