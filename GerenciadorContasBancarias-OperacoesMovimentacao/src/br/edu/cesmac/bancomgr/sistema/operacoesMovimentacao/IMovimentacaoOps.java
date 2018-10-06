package br.edu.cesmac.bancomgr.sistema.operacoesMovimentacao;

import java.util.List;

import br.edu.cesmac.bancomgr.sharedmodel.Transacao;

public interface IMovimentacaoOps {

	public List<Transacao> obterTransacoes();
	public Transacao sacar(int numeroConta, int senha, float valor);
	public Transacao depositar(int numeroConta, float valor);
	public Transacao transferir(int numeroContaOrigem, int senha, float valor, int numeroContaDestino);
	
}
