package com.dev.clean_arch.infra.presentation;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.clean_arch.infra.dtos.EventoDto;

@RestController
@RequestMapping("api/v1")
public class EventoController {

    @PostMapping("criarEvento")
    private String criarEvento(@RequestBody EventoDto eventoDto){
        return "Eventro criado";
    }
}
