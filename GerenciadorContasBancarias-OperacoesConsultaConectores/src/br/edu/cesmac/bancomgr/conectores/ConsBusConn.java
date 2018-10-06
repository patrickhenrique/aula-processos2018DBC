package br.edu.cesmac.bancomgr.conectores;

import br.edu.cesmac.bancomgr.business.BusinessController;
import br.edu.cesmac.bancomgr.business.INegocio;
import br.edu.cesmac.bancomgr.sistema.operacoesConsulta.IConsultaBReq;

public class ConsBusConn implements IConsultaBReq{
	private INegocio business;
	
	public ConsBusConn() {
		this.business = new BusinessController();
	}
}
