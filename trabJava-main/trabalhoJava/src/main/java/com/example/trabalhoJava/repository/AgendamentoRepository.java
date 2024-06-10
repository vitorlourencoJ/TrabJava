package com.example.trabalhoJava.repository;

import com.example.trabalhoJava.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {}

