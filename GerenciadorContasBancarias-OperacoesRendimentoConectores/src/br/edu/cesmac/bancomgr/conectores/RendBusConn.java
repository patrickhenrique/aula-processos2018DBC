package br.edu.cesmac.bancomgr.conectores;

import java.util.List;

import br.edu.cesmac.bancomgr.business.BusinessController;
import br.edu.cesmac.bancomgr.business.INegocio;
import br.edu.cesmac.bancomgr.sharedmodel.Conta;
import br.edu.cesmac.bancomgr.sistema.operacoesRendimento.IRendBReq;

public class RendBusConn implements IRendBReq{
	private INegocio business;
	
	public RendBusConn() { 
		this.business = new BusinessController();
	}


	@Override
	public List<Conta> obterContas() {
		// TODO Auto-generated method stub
		
		return this.business.obterContas();
	}

	@Override
	public void alterarConta(int numero, Conta conta) {
		// TODO Auto-generated method stub
		this.business.alterarConta(numero, conta);
	}
}
