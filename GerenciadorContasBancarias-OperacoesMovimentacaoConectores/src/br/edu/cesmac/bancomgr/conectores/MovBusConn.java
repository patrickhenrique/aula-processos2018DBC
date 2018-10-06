package br.edu.cesmac.bancomgr.conectores;

import br.edu.cesmac.bancomgr.business.BusinessController;
import br.edu.cesmac.bancomgr.business.INegocio;
import br.edu.cesmac.bancomgr.sistema.operacoesMovimentacao.IMovBReq;

public class MovBusConn implements IMovBReq{
	private INegocio business;
	
	public MovBusConn() {
		this.business = new BusinessController();
	}
}
