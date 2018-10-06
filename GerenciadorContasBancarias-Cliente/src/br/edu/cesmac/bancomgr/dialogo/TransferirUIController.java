package br.edu.cesmac.bancomgr.dialogo;

import javax.swing.JOptionPane;

import br.edu.cesmac.bancomgr.conectores.MovBusConn;
import br.edu.cesmac.bancomgr.sistema.operacoesMovimentacao.IMovimentacaoOps;
import br.edu.cesmac.bancomgr.sistema.operacoesMovimentacao.MovimentacaoController;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TransferirUIController {
	@FXML
	private TextField tfNumeroContaOrigem;
	@FXML
	private PasswordField pfSenha;
	@FXML
	private TextField tfValor;
	@FXML
	private TextField tfNumeroContaDestino;
	
	private IMovimentacaoOps movimentacaoController;
	
	
	Stage stageWindow;
	
	
	public TransferirUIController() {
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
		//TODO obter dados
		//this.movimentacaoController.transferir(numeroContaOrigem, senha, valor, numeroContaDestino);
		JOptionPane.showMessageDialog(null, "Transferência realizada com sucesso!");
	}

}
