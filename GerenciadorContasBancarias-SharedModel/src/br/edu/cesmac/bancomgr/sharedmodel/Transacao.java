package br.edu.cesmac.bancomgr.sharedmodel;

import java.util.Date;

public abstract class Transacao {
	private int id;
	private String nome;
	protected float valor;
	private Date data;
	
	
	
	public Transacao(int id, String nome, float valor, Date data) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.data = data;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public float getValor() {
		return valor;
	}
	
	public Date getData() {
		return data;
	}
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		boolean out = false;
		
		if(obj instanceof Transacao) {
			if(((Transacao)obj).getId() == this.getId())
				out = true;
		}
		
		return out;
	}
}
