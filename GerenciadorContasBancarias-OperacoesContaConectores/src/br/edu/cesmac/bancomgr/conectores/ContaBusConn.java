package br.edu.cesmac.bancomgr.conectores;

import br.edu.cesmac.bancomgr.business.BusinessController;
import br.edu.cesmac.bancomgr.business.INegocio;
import br.edu.cesmac.bancomgr.sistema.operacoesConta.IContaBReq;

public class ContaBusConn implements IContaBReq{
	private INegocio business;
	
	public ContaBusConn() {
		this.business = new BusinessController();
	}
}
