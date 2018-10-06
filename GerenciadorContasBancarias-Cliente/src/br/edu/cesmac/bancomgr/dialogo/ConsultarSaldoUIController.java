package br.edu.cesmac.bancomgr.dialogo;

import br.edu.cesmac.bancomgr.conectores.ConsBusConn;
import br.edu.cesmac.bancomgr.conectores.ContaBusConn;
import br.edu.cesmac.bancomgr.sistema.operacoesConsulta.ConsultasController;
import br.edu.cesmac.bancomgr.sistema.operacoesConsulta.IConsultaOps;
import br.edu.cesmac.bancomgr.sistema.operacoesConta.ContasController;
import br.edu.cesmac.bancomgr.sistema.operacoesConta.IContaOps;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ConsultarSaldoUIController {
	@FXML
	private TextField tfNumeroConta;
	@FXML
	private PasswordField pfSenha;
	
	
	
	private IConsultaOps consultaController;
	
	
	
	Stage stageWindow;
	
	
	public ConsultarSaldoUIController() {
		this.consultaController = new ConsultasController(new ConsBusConn());
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
