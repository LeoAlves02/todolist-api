package com.leonardoalves.todolist.dto;

import com.leonardoalves.todolist.model.Tarefa.Prioridade;
import com.leonardoalves.todolist.model.Tarefa.Status;

public class TarefaRequestDTO {

    private String nome;
    private String descricao;
    private Prioridade prioridade;
    private Status status;

    public TarefaRequestDTO() {}

    public TarefaRequestDTO(String nome, String descricao, Prioridade prioridade, Status status) {
        this.nome = nome;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
