package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args){
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane root = new BorderPane();
		Label text = new Label("Привет, мир");
		text.setFont(new Font(32));
		root.setCenter(text);
		Scene scene = new Scene(root, 400, 150);

		stage.setTitle("Заголовок окна");
		stage.setScene(scene);
		stage.show();
	}
}