package application;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;


public class SampleController {
	
	private Stage primaryStage;
	
	@FXML
	private Button button1;
	
	@FXML
	public void onClick(ActionEvent event) {
		//Получаем заголовок окна
		System.out.println(primaryStage.getTitle());
		//Получаем высоту и ширину окна
		System.out.println(primaryStage.getWidth() + " : " +
						   primaryStage.getHeight());
		Scene scene = primaryStage.getScene();
		//Получаем координаты сцены внутри окна
		System.out.println(scene.getX() + " : " + scene.getY());
	
	}
	
	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
}
