package br.edu.cesmac.bancomgr.ihc;


import java.io.IOException;

import br.edu.cesmac.bancomgr.dialogo.CriarContaPoupancaUIController;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class UICriarPoupancaUtil{
	private CriarContaPoupancaUIController controller;
	
	private Stage stage;
	
	
	
	
	
	public UICriarPoupancaUtil() {
		initializeIHC();
	}





	private void initializeIHC() {
		try{
			stage = new Stage();
			//INICIALIZE IHC ELEMENTS
			FXMLLoader loader = new FXMLLoader(getClass().getResource(
		               "./xml/criarContaPoupanca.fxml"));
			Parent fxmlParent;
			
			fxmlParent = (Parent) loader.load();
			
			controller = loader.getController();
			
			Scene scene = new Scene(fxmlParent, 600, 300);
			
			
			
			//INITIALIZE IHC
			stage.setScene(scene);
			stage.initStyle(StageStyle.UTILITY);
			stage.setAlwaysOnTop(true);
			stage.centerOnScreen();
			
			controller.setStageWindow(stage);
						
			stage.hide();
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
	
	
	

	//public void showKeyboard(JukeboxControllerFacade jukeController, String mensagemInicial) throws IOException{
	public void showWindow() {
			Platform.runLater(new Runnable() {
				
				@Override
				public void run() {
						//SHOW IHC
						stage.show();
						stage.setMaximized(false);
						stage.setFullScreen(false);
						stage.setAlwaysOnTop(true);
						stage.requestFocus();
				}
			});
	}
}
