package com.example.trabalhoJava.controller;

import com.example.trabalhoJava.dto.AgendamentoRequestDTO;
import com.example.trabalhoJava.dto.AgendamentoResponseDTO;
import com.example.trabalhoJava.dto.EstoqueRequestDTO;
import com.example.trabalhoJava.dto.EstoqueResponseDTO;
import com.example.trabalhoJava.model.Agendamento;
import com.example.trabalhoJava.model.Estoque;
import com.example.trabalhoJava.repository.AgendamentoRepository;
import com.example.trabalhoJava.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api") // Root path for all APIs
public class AppController {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    @Autowired
    private EstoqueRepository estoqueRepository;

    @PostMapping("/agendamentos")
    public void saveAgendamento(@RequestBody AgendamentoRequestDTO data) {
        Agendamento agendamentoData = new Agendamento(data);
        agendamentoRepository.save(agendamentoData);
    }

    @GetMapping("/agendamentos")
    public List<AgendamentoResponseDTO> getAllAgendamentos() {
        return agendamentoRepository.findAll().stream()
                .map(AgendamentoResponseDTO::new)
                .toList();
    }

    @PostMapping("/estoques")
    public void saveEstoque(@RequestBody EstoqueRequestDTO data) {
        Estoque estoqueData = new Estoque(data.produto(), data.quantidade(), data.preco());
        estoqueRepository.save(estoqueData);
    }

    @GetMapping("/estoques")
    public List<EstoqueResponseDTO> getAllEstoques() {
        return estoqueRepository.findAll().stream()
                .map(EstoqueResponseDTO::new)
                .toList();
    }
}

/*

Para agendamentos:
    http://localhost:8080/api/agendamentos

Para estoques:
    http://localhost:8080/api/estoques
*/

