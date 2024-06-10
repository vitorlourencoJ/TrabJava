package com.example.trabalhoJava.dto;

import com.example.trabalhoJava.model.Agendamento;

import java.time.LocalDate;
import java.time.LocalTime;

public record AgendamentoResponseDTO(Long id, String cliente, LocalDate data, LocalTime horario, String servico) {

    public AgendamentoResponseDTO(Agendamento agendamento){
        this(agendamento.getId(),
                agendamento.getCliente(),
                agendamento.getData(),
                agendamento.getHorario(),
                agendamento.getServico());
    }
}