package br.edu.cesmac.bancomgr.sharedmodel;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
	public static final int STATUS_ATIVA = 1;
	public static final int STATUS_INATIVA = 2;
	
	private int numero;
	protected float saldo;
	private String hashSenha;
	private int status;
	
	private Banco banco;
	private List<Cliente> clientes;
	private List<TransacaoDual> transacoesComoOrigem;
	private List<TransacaoDual> transacoesComoDestino;
	private List<TransacaoSimples> transacoesSimples;
	
	
	public Conta(int numero, float saldo, String hashSenha, Banco banco) {
		this.numero = numero;
		this.saldo = saldo;
		this.hashSenha = hashSenha;
		this.status = Conta.STATUS_ATIVA;
		this.banco = banco;
		this.clientes = new ArrayList<>();
		this.transacoesComoOrigem = new ArrayList<>();
		this.transacoesComoDestino = new ArrayList<>();
		this.transacoesSimples= new ArrayList<>();
	}
	
	public Conta(int numero, float saldo, int senha, Banco banco) {
		this.numero = numero;
		this.saldo = saldo;
		this.hashSenha = gerarHash(senha);
		this.status = Conta.STATUS_ATIVA;
		this.banco = banco;
		this.clientes = new ArrayList<>();
	}
	
	public int getNumero() {
		return numero;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public boolean validarSenha(int senha) {
		if(gerarHash(senha).equals(this.hashSenha))
			return true;
		else
			return false;
	}

	private String gerarHash(int senha) {
		String output = "default";
		String senhaStr = new Integer(senha).toString();
		MessageDigest m;
		try {
			m = MessageDigest.getInstance("MD5");
			m.reset();
			m.update(senhaStr.getBytes());
			byte[] digest = m.digest();
			BigInteger bigInt = new BigInteger(1,digest);
			output = bigInt.toString(16);
		} catch (NoSuchAlgorithmException e) {
			System.err.println("Erro: considerando valor default de hash");
		}
		return output;
	}
	
	public int getStatus() {
		return status;
	}
	
	public Banco getBanco() {
		return banco;
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public List<TransacaoDual> getTransacoesComoOrigem() {
		return transacoesComoOrigem;
	}
	
	public List<TransacaoDual> getTransacoesComoDestino() {
		return transacoesComoDestino;
	}
	
	public List<TransacaoSimples> getTransacoesSimples() {
		return transacoesSimples;
	}
	
	public void addCliente(Cliente c) {
		if(!this.clientes.contains(c))
			this.clientes.add(c);
	}
	
	public void addTransacoesComoOrigem(TransacaoDual t) {
		if(!this.transacoesComoOrigem.contains(t))
			this.transacoesComoOrigem.add(t);
	}
	
	public void addTransacoesComoDestino(TransacaoDual t) {
		if(!this.transacoesComoDestino.contains(t))
			this.transacoesComoDestino.add(t);
	}
	
	public void addTransacoesSimples(TransacaoSimples t) {
		if(!this.transacoesSimples.contains(t))
			this.transacoesSimples.add(t);
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		boolean out = false;
		
		if(obj instanceof Conta) {
			if(((Conta)obj).getNumero() == this.getNumero())
				out = true;
		}
		
		return out;
	}
}
