package br.edu.cesmac.bancomgr.ihc;


import br.edu.cesmac.bancomgr.dialogo.MainUIController;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	private MainUIController controller;
	
	
	
	@Override
	public void start(Stage primaryStage) {
				//open a thread for allowing the jukebox continuous monitoring
				Platform.runLater(new Runnable() {
					@Override
					public void run() {
						try {
							//INICIALIZE IHC ELEMENTS
							FXMLLoader loader = new FXMLLoader(getClass().getResource(
						               "./xml/main.fxml"));
							Parent fxmlParent;
							
							fxmlParent = (Parent) loader.load();
							
							controller = loader.getController();
							
							Scene scene = new Scene(fxmlParent, 800, 700);
							
							
							//SET ON CLOSE
							primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>(){
								public void handle(WindowEvent we) {
						              System.out.println("Bye bye!");
						              System.exit(0);
						          }
							});
							
							
							
							//SHOW IHC IN FULL SCREEN
							primaryStage.setScene(scene);
							primaryStage.setTitle("Controle de Contas");
							primaryStage.show();
							//primaryStage.setMaximized(true);
							//primaryStage.setFullScreen(true);
							
					
							//INITIALIZE DATA
							controller.reloadData();							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
	}
	
	

	public static void main(String[] args) {
		launch(args);
	}
}
