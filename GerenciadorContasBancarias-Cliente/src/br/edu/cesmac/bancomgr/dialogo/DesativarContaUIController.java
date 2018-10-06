package br.edu.cesmac.bancomgr.dialogo;

import br.edu.cesmac.bancomgr.conectores.ContaBusConn;
import br.edu.cesmac.bancomgr.sistema.operacoesConta.ContasController;
import br.edu.cesmac.bancomgr.sistema.operacoesConta.IContaOps;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DesativarContaUIController {
	@FXML
	private TextField tfNumeroConta;	
	
	private IContaOps contaController;
	
	
	
	Stage stageWindow;
	
	
	public DesativarContaUIController() {
		this.contaController = new ContasController(new ContaBusConn());
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
