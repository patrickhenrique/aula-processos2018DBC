package br.edu.cesmac.bancomgr.sistema.operacoesConta;


import java.util.List;

import br.edu.cesmac.bancomgr.sharedmodel.Conta;
import br.edu.cesmac.bancomgr.sharedmodel.Corrente;
import br.edu.cesmac.bancomgr.sharedmodel.Poupanca;

public class ContasController implements IContaOps {
	private IContaBReq required;
	
	public ContasController(IContaBReq required) {
		this.required = required;
	}

	
	@Override
	public List<Conta> obterContas() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public Poupanca criarContaPoupanca(int numero, int senha, int diaAniversario, float taxaRendimento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Corrente criarContaCorrente(int numero, int senha, float limite, float taxaJuros) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean desativarConta(int numero) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ativarConta(int numero) {
		// TODO Auto-generated method stub
		return false;
	}

}
