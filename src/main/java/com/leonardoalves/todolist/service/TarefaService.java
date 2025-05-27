package com.leonardoalves.todolist.service;

import com.leonardoalves.todolist.model.Tarefa;
import com.leonardoalves.todolist.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {
    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> listarTarefas() {
        return tarefaRepository.findAll();
    }

    public Optional<Tarefa> buscarTarefaPorId(Long id) {
        return tarefaRepository.findById(id);
    }

    public Tarefa salvarTarefa(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public void excluirTarefa(Long id) {
        tarefaRepository.deleteById(id);
    }

    public Optional<Tarefa> atualizarTarefa(Long id, Tarefa tarefaAtualizada) {
        return tarefaRepository.findById(id)
                .map(tarefa -> {
                    tarefa.setNome(tarefaAtualizada.getNome());
                    tarefa.setDescricao(tarefaAtualizada.getDescricao());
                    tarefa.setPrioridade(tarefaAtualizada.getPrioridade());
                    tarefa.setStatus(tarefaAtualizada.getStatus());
                    return tarefaRepository.save(tarefa);
                });
    }

}
