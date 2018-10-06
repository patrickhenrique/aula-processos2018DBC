package br.edu.cesmac.bancomgr.sharedmodel;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private int codigo;
	private String nome;
	
	private List<Cliente> clientes;
	private List<Conta> contas;
	
	
	public Banco(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
		this.clientes = new ArrayList<>();
		this.contas= new ArrayList<>();
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public List<Conta> getContas() {
		return contas;
	}
	
	public void addCliente(Cliente c) {
		if(!this.clientes.contains(c)) {
			this.clientes.add(c);
			for(Conta ct : c.getContas()) {
				this.addConta(ct);
			}
		}
	}
		
	
	public void addConta(Conta c) {
		if(!this.contas.contains(c)) {
			this.contas.add(c);
			for(Cliente cl : c.getClientes()) {
				this.addCliente(cl);
			}
		}
	}
	
	
	@Override
	public boolean equals(Object obj) {
		boolean out = false;
		
		if(obj instanceof Banco) {
			if(((Banco)obj).getCodigo() == this.getCodigo())
				out = true;
		}
		
		return out;
	}
}
