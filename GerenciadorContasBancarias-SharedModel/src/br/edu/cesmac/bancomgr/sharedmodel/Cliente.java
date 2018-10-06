package br.edu.cesmac.bancomgr.sharedmodel;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private int id;
	private String cpf;
	private String nome;
	
	private Banco banco;
	private CategoriaCliente categoria;
	private List<Conta> contas;
	
	
	public Cliente(int id, String cpf, String nome, Banco banco, CategoriaCliente categoria) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.banco = banco;
		this.categoria = categoria;
		this.contas = new ArrayList<>();
	}
	
	public int getId() {
		return id;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Banco getBanco() {
		return banco;
	}
	
	public CategoriaCliente getCategoria() {
		return categoria;
	}
	
	public List<Conta> getContas() {
		return contas;
	}
	
	public void adicionarConta(Conta c) {
		if(!this.contas.contains(c))
			this.contas.add(c);
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		boolean out = false;
		
		if(obj instanceof Cliente) {
			if(((Cliente)obj).getId() == this.getId())
				out = true;
		}
		
		return out;
	}
}
