package br.edu.cesmac.bancomgr.sharedmodel;

import java.util.Date;

public class TransacaoSimples extends Transacao{
	
	private Conta alvo;

	public TransacaoSimples(int id, String nome, float valor, Date data, Conta alvo) {
		super(id, nome, valor, data);
		this.alvo = alvo;
	}
	
	public Conta getAlvo() {
		return alvo;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		boolean out = false;
		
		if(obj instanceof TransacaoSimples) {
			if(((TransacaoSimples)obj).getId() == this.getId())
				out = true;
		}
		
		return out;
	}
}
