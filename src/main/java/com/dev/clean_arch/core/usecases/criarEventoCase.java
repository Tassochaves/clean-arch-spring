package com.dev.clean_arch.core.usecases;

import com.dev.clean_arch.core.domain.Evento;

public interface criarEventoCase {
    public Evento execute(Evento evento);
}
