package br.edu.cesmac.bancomgr.dialogo;

import br.edu.cesmac.bancomgr.conectores.MovBusConn;
import br.edu.cesmac.bancomgr.sistema.operacoesMovimentacao.IMovimentacaoOps;
import br.edu.cesmac.bancomgr.sistema.operacoesMovimentacao.MovimentacaoController;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SacarUIController {
	@FXML
	private TextField tfNumeroConta;
	@FXML
	private PasswordField pfSenha;
	@FXML
	private TextField tfValor;
	
	
	private IMovimentacaoOps movimentacaoController;
	
	
	
	Stage stageWindow;
	
	
	
	public SacarUIController() {
		this.movimentacaoController = new MovimentacaoController(new MovBusConn());
	}
	
	public void setStageWindow(Stage stage) {
		this.stageWindow = stage;
	}
	
	
	@FXML
	public void fecharJanela() {
		this.stageWindow.close();
	}
	
	@FXML
	public void ok() {
		//TODO implementar
	}

}
