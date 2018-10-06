package br.edu.cesmac.bancomgr.conectores;

import java.util.List;

import br.edu.cesmac.bancomgr.business.BusinessController;
import br.edu.cesmac.bancomgr.business.INegocio;
import br.edu.cesmac.bancomgr.sharedmodel.Conta;
import br.edu.cesmac.bancomgr.sharedmodel.Transacao;
import br.edu.cesmac.bancomgr.sharedmodel.TransacaoDual;
import br.edu.cesmac.bancomgr.sharedmodel.TransacaoSimples;
import br.edu.cesmac.bancomgr.sistema.operacoesMovimentacao.IMovBReq;

public class MovBusConn implements IMovBReq{
	private INegocio business;
	
	public MovBusConn() {
		this.business = new BusinessController();
	}

	@Override
	public Conta getConta(int numeroConta) {
		return this.business.obterConta(numeroConta);
	}

	@Override
	public Transacao adicionarTransacao(TransacaoSimples transacaoSimples) {
		// TODO Auto-generated method stub
		this.business.adicionarTransacao(transacaoSimples);
		
		return transacaoSimples;
	}

	@Override
	public void alterarConta(int numeroConta, Conta conta) {
		// TODO Auto-generated method stub
		this.business.alterarConta(numeroConta, conta);
	}

	@Override
	public Transacao adicionarTransacaoDual(TransacaoDual transacaoDual) {
		// TODO Auto-generated method stub
		this.business.adicionarTransacao(transacaoDual);
		return transacaoDual;
	}

	@Override
	public List<Transacao> obterTransacoes() {
		// TODO Auto-generated method stub
		return this.business.obterTransacoes();
	}
}
