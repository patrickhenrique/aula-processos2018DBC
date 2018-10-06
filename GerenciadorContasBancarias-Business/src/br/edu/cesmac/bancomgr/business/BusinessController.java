package br.edu.cesmac.bancomgr.business;

import java.util.ArrayList;
import java.util.Iterator;
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
	
	
	public BusinessController() {
		this.contasCadastradas = new ArrayList<>();
		this.clientesCadastradas = new ArrayList<>();
		this.categoriasClientesCadastradas = new ArrayList<>();
		this.transacoesCadastradas = new ArrayList<>();
	}
	

	@Override
	public List<Conta> obterContas() {
		if(this.contasCadastradas ==null)
			this.contasCadastradas = new ArrayList<>();
		return this.contasCadastradas;
	}

	@Override
	public List<Transacao> obterTransacoes() {
		if(this.transacoesCadastradas ==null)
			this.transacoesCadastradas = new ArrayList<>();
		return this.transacoesCadastradas;
	}

	@Override
	public void definirDadosBanco(Banco b) {
		if(b != null)
			this.dadosBanco = b;
	}

	@Override
	public void adicionarConta(Conta c) {
		if(!this.contasCadastradas.contains(c)) {
			this.contasCadastradas.add(c);
		}
	}

	@Override
	public void adicionarTransacao(Transacao t) {
		if(!this.transacoesCadastradas.contains(t)) {
			this.transacoesCadastradas.add(t);
		}
	}

	@Override
	public void adicionarCategoriaCliente(CategoriaCliente c) {
		if(!this.categoriasClientesCadastradas.contains(c)) {
			this.categoriasClientesCadastradas.add(c);
		}
	}


	@Override
	public void adicionarCliente(Cliente c) {
		if(!this.clientesCadastradas.contains(c)) {
			this.clientesCadastradas.add(c);
		}
	}

	@Override
	public void excluirConta(Conta c) {
		if(this.contasCadastradas.contains(c)) {
			this.contasCadastradas.remove(c);
		}
	}


	@Override
	public void excluirCategoriaCliente(CategoriaCliente c) {
		if(this.categoriasClientesCadastradas.contains(c)) {
			this.categoriasClientesCadastradas.remove(c);
		}
	}

	
	@Override
	public void excluirCliente(Cliente c) {
		if(this.clientesCadastradas.contains(c)) {
			this.clientesCadastradas.remove(c);
		}
	}
	
	@Override
	public void excluirTransacao(Transacao t) {
		if(this.transacoesCadastradas.contains(t)) {
			this.transacoesCadastradas.remove(t);
		}
	}

	@Override
	public void alterarConta(int numero, Conta c) {
		for(int i = 0; i< this.contasCadastradas.size(); i++) {
			Conta atual = this.contasCadastradas.get(i);
			if(atual.getNumero() == numero) {
				this.contasCadastradas.set(i, c);
				break;
			}
		}
	}

	@Override
	public void alterarTransacao(int id, Transacao t) {
		for(int i = 0; i< this.transacoesCadastradas.size(); i++) {
			Transacao atual = this.transacoesCadastradas.get(i);
			if(atual.getId() == id) {
				this.transacoesCadastradas.set(i, t);
				break;
			}
		}
	}

	@Override
	public void alterarCategoriaCliente(int id, CategoriaCliente c) {
		for(int i = 0; i< this.categoriasClientesCadastradas.size(); i++) {
			CategoriaCliente atual = this.categoriasClientesCadastradas.get(i);
			if(atual.getId() == id) {
				this.categoriasClientesCadastradas.set(i, c);
				break;
			}
		}
	}


	@Override
	public void alterarCliente(int id, Cliente c) {
		for(int i = 0; i< this.clientesCadastradas.size(); i++) {
			Cliente atual = this.clientesCadastradas.get(i);
			if(atual.getId() == id) {
				this.clientesCadastradas.set(i, c);
				break;
			}
		}
	}

}
