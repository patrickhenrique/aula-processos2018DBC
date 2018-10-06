package br.edu.cesmac.bancomgr.sharedmodel;

public class Corrente extends Conta{
	private float limite;
	private float taxaJuros;
	

	public Corrente(int numero, float saldo, String hashSenha, Banco banco, float limite, float taxaJuros) {
		super(numero, saldo, hashSenha, banco);
		this.limite = limite;
		this.taxaJuros = taxaJuros;
	}
	
	public Corrente(int numero, float saldo, int senha, Banco banco, float limite, float taxaJuros) {
		super(numero, saldo, senha, banco);
		this.limite = limite;
		this.taxaJuros = taxaJuros;
	}
	
	
	public float getLimite() {
		return limite;
	}
	
	public float getTaxaJuros() {
		return taxaJuros;
	}

	
	
	@Override
	public boolean equals(Object obj) {
		boolean out = false;
		
		if(obj instanceof Corrente) {
			if(((Corrente)obj).getNumero() == this.getNumero())
				out = true;
		}
		
		return out;
	}
}
