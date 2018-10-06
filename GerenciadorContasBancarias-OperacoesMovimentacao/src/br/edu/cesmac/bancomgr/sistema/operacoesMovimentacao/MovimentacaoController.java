package br.edu.cesmac.bancomgr.sistema.operacoesMovimentacao;

import java.util.Date;
import java.util.List;

import br.edu.cesmac.bancomgr.sharedmodel.Conta;
import br.edu.cesmac.bancomgr.sharedmodel.Transacao;
import br.edu.cesmac.bancomgr.sharedmodel.TransacaoDual;
import br.edu.cesmac.bancomgr.sharedmodel.TransacaoSimples;

public class MovimentacaoController implements IMovimentacaoOps {
	private IMovBReq required;
	
	public MovimentacaoController(IMovBReq required) {
		this.required = required;
	}

	
	@Override
	public List<Transacao> obterTransacoes() {
		return this.required.obterTransacoes();
	}
	
	@Override
	public Transacao sacar(int numeroConta, int senha, float valor) {
		Conta conta =  this.required.getConta(numeroConta);
		if(conta.validarSenha(senha)){
			Float saldo = conta.getSaldo();
			if(valor <= saldo){
				conta.setSaldo(saldo - valor);
				this.required.alterarConta(numeroConta, conta);
				return this.required.adicionarTransacao(new TransacaoSimples(1, "Sacar", valor, new Date(), conta));
			}else{
				System.err.println("Erro: saldo insuficiente, operação cancelada.");
				return null;
			}
		}else{
			System.err.println("Erro: senha incorreta.");
			return null;
		}

	}

	@Override
	public Transacao depositar(int numeroConta, float valor) {
		Conta conta = this.required.getConta(numeroConta);
		Float saldoAtual = conta.getSaldo();
		conta.setSaldo(saldoAtual+ valor);
		this.required.alterarConta(numeroConta, conta);
		return this.required.adicionarTransacao(new TransacaoSimples(2, "Depositar", valor, new Date(), conta));
	}

	@Override
	public Transacao transferir(int numeroContaOrigem, int senha, float valor, int numeroContaDestino) {
		Conta contaOrigem =  this.required.getConta(numeroContaOrigem);
		Conta contaDestino =  this.required.getConta(numeroContaDestino);
		if(contaOrigem.validarSenha(senha)){
			Float saldoOrigem = contaOrigem.getSaldo();
			if(valor <= saldoOrigem){
				contaOrigem.setSaldo(saldoOrigem - valor);				
				contaDestino.setSaldo(contaDestino.getSaldo() + valor);
				this.required.alterarConta(numeroContaOrigem, contaOrigem);
				this.required.alterarConta(numeroContaDestino, contaDestino);
				return this.required.adicionarTransacaoDual(new TransacaoDual(3, "Transação", valor, new Date(), contaOrigem, contaDestino));
			}else{
				System.err.println("Erro: saldo insuficiente, operação cancelada.");
				return null;
			}
		}else{
			System.err.println("Erro: senha incorreta.");
			return null;
		}
	}
}
 