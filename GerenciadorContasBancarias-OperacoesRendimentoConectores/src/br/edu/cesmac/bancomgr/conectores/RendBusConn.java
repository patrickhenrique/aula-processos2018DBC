package br.edu.cesmac.bancomgr.conectores;

import br.edu.cesmac.bancomgr.business.BusinessController;
import br.edu.cesmac.bancomgr.business.INegocio;
import br.edu.cesmac.bancomgr.sistema.operacoesRendimento.IRendBReq;

public class RendBusConn implements IRendBReq{
	private INegocio business;
	
	public RendBusConn() {
		this.business = new BusinessController();
	}
}
