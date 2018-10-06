package br.edu.cesmac.bancomgr.business;

import java.util.List;

import br.edu.cesmac.bancomgr.sharedmodel.Banco;
import br.edu.cesmac.bancomgr.sharedmodel.CategoriaCliente;
import br.edu.cesmac.bancomgr.sharedmodel.Cliente;
import br.edu.cesmac.bancomgr.sharedmodel.Conta;
import br.edu.cesmac.bancomgr.sharedmodel.Transacao;

public class BusinessController implements INegocio {
	//DUMMY DATABASE - INICIO
	List<Conta> contasCadastradas;
	List<Cliente> clientesCadastradas;
	List<CategoriaCliente> categoriasClientesCadastradas;
	List<Transacao> transacoesCadastradas;
	Banco dadosBanco;
	//DUMMY DATABASE - FIM
	
	

	@Override
	public List<Conta> obterContas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transacao> obterTransacoes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void definirDadosBanco(Banco b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarConta(Conta c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarTransacao(Transacao t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarCategoriaCliente(CategoriaCliente c) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void adicionarCliente(Cliente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirConta(Conta c) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void excluirCategoriaCliente(CategoriaCliente c) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void excluirCliente(Cliente c) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void excluirTransacao(Transacao t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarConta(int numero, Conta c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarTransacao(int id, Transacao t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarCategoriaCliente(int id, CategoriaCliente c) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void alterarCliente(int id, Cliente c) {
		// TODO Auto-generated method stub
		
	}

}
