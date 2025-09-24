package com.dev.clean_arch.core.domain;

import java.time.LocalDateTime;

import com.dev.clean_arch.core.enums.TipoEvento;

public record Evento(
    Long id,
    String nome,
    String descricao,
    String identificador,
    String local,
    String organizador,
    LocalDateTime dataInicio,
    LocalDateTime dataFim,

    TipoEvento tipoEvento
) {
}
