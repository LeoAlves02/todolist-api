package com.leonardoalves.todolist.controller;

import com.leonardoalves.todolist.dto.TarefaRequestDTO;
import com.leonardoalves.todolist.dto.TarefaResponseDTO;
import com.leonardoalves.todolist.model.Tarefa;
import com.leonardoalves.todolist.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    // Converter entidade para DTO
    private TarefaResponseDTO toResponseDTO(Tarefa tarefa) {
        return new TarefaResponseDTO(
                tarefa.getId(),
                tarefa.getNome(),
                tarefa.getDescricao(),
                tarefa.getPrioridade(),
                tarefa.getStatus()
        );
    }

    // Converter DTO para entidade
    private Tarefa toEntity(TarefaRequestDTO dto) {
        Tarefa tarefa = new Tarefa();
        tarefa.setNome(dto.getNome());
        tarefa.setDescricao(dto.getDescricao());
        tarefa.setPrioridade(dto.getPrioridade());
        tarefa.setStatus(dto.getStatus());
        return tarefa;
    }

    @GetMapping
    public List<TarefaResponseDTO> listarTarefas() {
        List<Tarefa> tarefas = tarefaService.listarTarefas();
        return tarefas.stream()
                .map(this::toResponseDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public TarefaResponseDTO buscarTarefaPorId(@PathVariable Long id) {
        Tarefa tarefa = tarefaService.buscarTarefaPorId(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
        return toResponseDTO(tarefa);
    }

    @PostMapping
    public TarefaResponseDTO salvarTarefa(@RequestBody TarefaRequestDTO tarefaRequestDTO) {
        Tarefa tarefa = toEntity(tarefaRequestDTO);
        Tarefa salva = tarefaService.salvarTarefa(tarefa);
        return toResponseDTO(salva);
    }

    @PutMapping("/{id}")
    public TarefaResponseDTO atualizarTarefa(@PathVariable Long id, @RequestBody TarefaRequestDTO tarefaRequestDTO) {
        Tarefa tarefaAtualizada = toEntity(tarefaRequestDTO);
        Tarefa tarefa = tarefaService.atualizarTarefa(id, tarefaAtualizada)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada para atualização"));
        return toResponseDTO(tarefa);
    }

    @DeleteMapping("/{id}")
    public void excluirTarefa(@PathVariable Long id) {
        tarefaService.excluirTarefa(id);
    }
}
