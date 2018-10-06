package br.edu.cesmac.bancomgr.sistema.operacoesMovimentacao;

import java.util.List;

import br.edu.cesmac.bancomgr.sharedmodel.Transacao;

public class MovimentacaoController implements IMovimentacaoOps {
	private IMovBReq required;
	
	public MovimentacaoController(IMovBReq required) {
		this.required = required;
	}

	
	@Override
	public List<Transacao> obterTransacoes() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Transacao sacar(int numeroConta, int senha, float valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transacao depositar(int numeroConta, float valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transacao transferir(int numeroContaOrigem, int senha, float valor, int numeroContaDestino) {
		// TODO Auto-generated method stub
		return null;
	}
}
