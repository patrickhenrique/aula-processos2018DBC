package br.edu.cesmac.bancomgr.sistema.operacoesRendimento;

import java.util.List;

import br.edu.cesmac.bancomgr.sharedmodel.Conta;
import br.edu.cesmac.bancomgr.sharedmodel.Poupanca;


public class RendimentoController implements IRendimentoOps{
	private IRendBReq required;
	// variavel para aplicar rendimento
	private static float rendimento = (float) 0.3;
	private static float juros = (float) 0.5;
	
	public RendimentoController(IRendBReq required) {
		this.required = required;
	} 
	

	@Override 
	public boolean aplicarRendimento() {
		// TODO Auto-generated method stub
		List<Conta> contas = this.required.obterContas();
		 
		for (Conta conta : contas) {
			if (conta instanceof Poupanca){
				conta.setSaldo(rendimento + conta.getSaldo());
				this.required.alterarConta(conta.getNumero() , conta);
			}
		}
		return false;
	}

	@Override
	public boolean cobrarJuros() {
		// TODO Auto-generated method stub
		List<Conta> contas = this.required.obterContas();
		
		for (Conta conta : contas) {
			if (conta instanceof Poupanca){
				conta.setSaldo(conta.getSaldo() - juros);
				this.required.alterarConta(conta.getNumero() , conta);

			}
		}
		return false;
	}

}


// pegar contas do banco e varrer, a que for polpança, aplicar rendimento;

// aplicar consntante float com 

// 
