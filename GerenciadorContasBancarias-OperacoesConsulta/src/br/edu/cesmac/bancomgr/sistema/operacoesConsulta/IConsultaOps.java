package br.edu.cesmac.bancomgr.sistema.operacoesConsulta;

import java.util.Date;
import java.util.List;

import br.edu.cesmac.bancomgr.sharedmodel.Transacao;

public interface IConsultaOps {
	
	public float consultarSaldo(int numeroConta, int senha);
	public List<Transacao> obterExtrato(int numeroConta, int senha, Date dataInicio, Date dataFim);
	public List<Transacao> obterExtrato(int numeroConta, int senha);
}
