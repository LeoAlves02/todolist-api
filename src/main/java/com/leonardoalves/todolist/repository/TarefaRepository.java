package com.leonardoalves.todolist.repository;

import com.leonardoalves.todolist.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
