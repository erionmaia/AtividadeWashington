package com.taskmanager.easytask.entities.enums;

public enum TarefaStatus {

	EM_ANDAMENTO(1),
	CONCLUIDO(2);
	
	private int code;
	
	private TarefaStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static TarefaStatus valueOf(int code) {
		for (TarefaStatus value : TarefaStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Código da TarefaStatus inválido");
	}
}
