package br.edu.cesmac.bancomgr.sistema.operacoesRendimento;

import java.util.List;

import br.edu.cesmac.bancomgr.sharedmodel.Conta;

public interface IRendBReq {

	List<Conta> obterContas();

	void alterarConta(int numero, Conta conta);

}
