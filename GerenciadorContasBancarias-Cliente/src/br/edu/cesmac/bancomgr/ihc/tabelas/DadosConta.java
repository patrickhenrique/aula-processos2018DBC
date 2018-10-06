package br.edu.cesmac.bancomgr.ihc.tabelas;

import br.edu.cesmac.bancomgr.sharedmodel.Conta;
import br.edu.cesmac.bancomgr.sharedmodel.Corrente;
import br.edu.cesmac.bancomgr.sharedmodel.Poupanca;

public class DadosConta {
	private int numero;
	private float saldo;
	private String tipo;
	private String status;
	
	public DadosConta(Conta conta) {
		this.numero = conta.getNumero();
		this.saldo = conta.getSaldo();
		if(conta instanceof Corrente)
			this.tipo = "CC";
		else if(conta instanceof Poupanca)
			this.tipo = "Poup";
		if(conta.getStatus()==Conta.STATUS_ATIVA)
			this.status = "A";
		else if(conta.getStatus()==Conta.STATUS_INATIVA)
			this.status = "I";
	}
	

	public int getNumero() {
		return numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public String getTipo() {
		return tipo;
	}

	public String getStatus() {
		return status;
	}
}
