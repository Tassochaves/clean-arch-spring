package com.dev.clean_arch.infra.mapper;

import com.dev.clean_arch.core.domain.Evento;
import com.dev.clean_arch.infra.dtos.EventoDto;

public class EventoDtoMapper {

    public Evento paraDomain(EventoDto dto){
        if (dto == null){
            return null;
        }

        return new Evento(
            dto.id(),
            dto.nome(),
            dto.descricao(),
            dto.identificador(),
            dto.localEvento(),
            dto.organizador(),
            dto.dataInicio(),
            dto.dataFim(),
            dto.tipoEvento()
        );
    }

    public EventoDto paraDto(Evento evento){
        if (evento == null) {
            return null;
        }

        return new EventoDto(
            evento.id(),
            evento.nome(),
            evento.descricao(),
            evento.identificador(),
            evento.localEvento(),
            evento.organizador(),
            evento.dataInicio(),
            evento.dataFim(),
            evento.tipoEvento()
        );
    }
}
