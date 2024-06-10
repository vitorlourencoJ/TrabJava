package com.example.trabalhoJava.dto;

import com.example.trabalhoJava.model.Estoque;

public record EstoqueResponseDTO(Long id, String produto, int quantidade, double preco) {
    public EstoqueResponseDTO(Estoque estoque) {
        this(estoque.getId(), estoque.getProduto(), estoque.getQuantidade(), estoque.getPreco());
    }
}

