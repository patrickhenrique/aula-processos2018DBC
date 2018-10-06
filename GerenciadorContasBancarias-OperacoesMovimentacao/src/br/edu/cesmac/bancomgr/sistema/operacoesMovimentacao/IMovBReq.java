package br.edu.cesmac.bancomgr.sistema.operacoesMovimentacao;

import java.util.List;

import br.edu.cesmac.bancomgr.sharedmodel.Conta;
import br.edu.cesmac.bancomgr.sharedmodel.Transacao;
import br.edu.cesmac.bancomgr.sharedmodel.TransacaoDual;
import br.edu.cesmac.bancomgr.sharedmodel.TransacaoSimples;

public interface IMovBReq {

	Conta getConta(int numeroConta);

	Transacao adicionarTransacao(TransacaoSimples transacaoSimples);

	void alterarConta(int numeroConta, Conta conta);

	Transacao adicionarTransacaoDual(TransacaoDual transacaoDual );

	List<Transacao> obterTransacoes();

}
