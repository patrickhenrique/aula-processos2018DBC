package br.edu.cesmac.bancomgr.sistema.operacoesRendimento;


public class RendimentoController implements IRendimentoOps{
	private IRendBReq required;
	
	public RendimentoController(IRendBReq required) {
		this.required = required;
	}

	@Override
	public boolean aplicarRendimento() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cobrarJuros() {
		// TODO Auto-generated method stub
		return false;
	}

}
