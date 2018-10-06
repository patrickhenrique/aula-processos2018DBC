package br.edu.cesmac.bancomgr.sistema.operacoesConsulta;

import java.util.Date;
import java.util.List;

import br.edu.cesmac.bancomgr.sharedmodel.Transacao;

public class ConsultasController implements IConsultaOps {
	private IConsultaBReq required;
	
	public ConsultasController(IConsultaBReq required) {
		this.required = required;
	}

	@Override
	public float consultarSaldo(int numeroConta, int senha) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Transacao> obterExtrato(int numeroConta, int senha, Date dataInicio, Date dataFim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transacao> obterExtrato(int numeroConta, int senha) {
		// TODO Auto-generated method stub
		return null;
	}

}
