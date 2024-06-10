package com.example.trabalhoJava.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public record AgendamentoRequestDTO(String cliente, LocalDate data, LocalTime horario, String servico) {}

