package com.taskmanager.easytask.entities;

import java.io.Serializable;
import java.util.Date;

import com.taskmanager.easytask.entities.enums.TarefaStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "task")
public class Tarefa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String descricao;
	private Date dataDeInicio;
	private Date dataDeConclusao;
	private Integer prioridade;
	private TarefaStatus status;
	
	public Tarefa() {
	}

	public Tarefa(Long id, String titulo, String descricao, Date dataDeInicio, Date dataDeConclusao, Integer prioridade,
			TarefaStatus status) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataDeInicio = dataDeInicio;
		this.dataDeConclusao = dataDeConclusao;
		this.prioridade = prioridade;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataDeInicio() {
		return dataDeInicio;
	}

	public void setDataDeInicio(Date dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}

	public Date getDataDeConclusao() {
		return dataDeConclusao;
	}

	public void setDataDeConclusao(Date dataDeConclusao) {
		this.dataDeConclusao = dataDeConclusao;
	}

	public Integer getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}

	public TarefaStatus getStatus() {
		return status;
	}

	public void setStatus(TarefaStatus status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
