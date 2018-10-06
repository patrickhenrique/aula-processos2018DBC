package br.edu.cesmac.bancomgr.ihc.tabelas;

import br.edu.cesmac.bancomgr.sharedmodel.Transacao;
import br.edu.cesmac.bancomgr.sharedmodel.TransacaoDual;
import br.edu.cesmac.bancomgr.sharedmodel.TransacaoSimples;

public class DadosTransacao {
	private int numeroOrigem;
	private int numeroDestino;
	private String nome;
	private float valor;
	
	public DadosTransacao(Transacao transacao) {
		if(transacao instanceof TransacaoSimples) {
			this.numeroOrigem = ((TransacaoSimples)transacao).getAlvo().getNumero();
			this.numeroDestino = 0;
		}
		else if(transacao instanceof TransacaoDual) {
			this.numeroOrigem = ((TransacaoDual)transacao).getOrigem().getNumero();
			this.numeroDestino = ((TransacaoDual)transacao).getDestino().getNumero();
		}
		this.nome = transacao.getNome();
		this.valor = transacao.getValor();
	}

	
	public int getNumeroOrigem() {
		return numeroOrigem;
	}

	public int getNumeroDestino() {
		return numeroDestino;
	}

	public String getNome() {
		return nome;
	}

	public float getValor() {
		return valor;
	}

	
}
