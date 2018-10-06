package br.edu.cesmac.bancomgr.dialogo;

import br.edu.cesmac.bancomgr.conectores.ConsBusConn;
import br.edu.cesmac.bancomgr.sistema.operacoesConsulta.ConsultasController;
import br.edu.cesmac.bancomgr.sistema.operacoesConsulta.IConsultaOps;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ObterExtratoPeriodoUIController {
	@FXML
	private TextField tfNumeroConta;
	@FXML
	private PasswordField pfSenha;
	@FXML
	private DatePicker dpDataInicio;
	@FXML
	private DatePicker dpDataFim;
	
	
	private IConsultaOps consultaController;
	
	
	
	Stage stageWindow;
	
	
	public ObterExtratoPeriodoUIController() {
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
