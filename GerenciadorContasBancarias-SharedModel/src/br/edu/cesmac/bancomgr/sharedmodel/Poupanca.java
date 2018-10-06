package br.edu.cesmac.bancomgr.sharedmodel;

public class Poupanca extends Conta{
	private int diaAniversario;
	private float taxaRendimento;
	

	public Poupanca(int numero, float saldo, String hashSenha, Banco banco, int diaAniversario, float taxaRendimento) {
		super(numero, saldo, hashSenha, banco);
		this.diaAniversario = diaAniversario;
		this.taxaRendimento = taxaRendimento;
	}
	
	public Poupanca(int numero, float saldo, int senha, Banco banco, int diaAniversario, float taxaRendimento) {
		super(numero, saldo, senha, banco);
		this.diaAniversario = diaAniversario;
		this.taxaRendimento = taxaRendimento;
	}
	
	
	public int getDiaAniversario() {
		return diaAniversario;
	}
	
	public float getTaxaRendimento() {
		return taxaRendimento;
	}

	
	
	
	@Override
	public boolean equals(Object obj) {
		boolean out = false;
		
		if(obj instanceof Poupanca) {
			if(((Poupanca)obj).getNumero() == this.getNumero())
				out = true;
		}
		
		return out;
	}
}
