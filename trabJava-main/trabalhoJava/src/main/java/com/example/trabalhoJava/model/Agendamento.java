package com.example.trabalhoJava.model;

import com.example.trabalhoJava.dto.AgendamentoRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Table(name = "agendamentos")
@Entity(name = "agendamentos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cliente;
    private LocalDate data;
    private LocalTime horario;
    private String servico;

    public Agendamento(AgendamentoRequestDTO data){
        this.cliente = data.cliente();
        this.data = data.data();
        this.horario = data.horario();
        this.servico = data.servico();
    }
}


