package br.edu.cesmac.bancomgr.sharedmodel;

import java.util.Date;

public class TransacaoDual extends Transacao{
	private Conta origem;
	private Conta destino;

	public TransacaoDual(int id, String nome, float valor, Date data, Conta origem, Conta destino) {
		super(id, nome, valor, data);
		this.origem = origem;
		this.destino = destino;
	}
	
	public Conta getOrigem() {
		return origem;
	}
	
	public Conta getDestino() {
		return destino;
	}

	
	
	@Override
	public boolean equals(Object obj) {
		boolean out = false;
		
		if(obj instanceof TransacaoDual) {
			if(((TransacaoDual)obj).getId() == this.getId())
				out = true;
		}
		
		return out;
	}
}
