package com.example.trabalhoJava.repository;

import com.example.trabalhoJava.model.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
}

