package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;


public class SampleController {
	@FXML
	private Button button1;

	private int n = 0;
	// Event Listener on Button[#button1].onAction
	@FXML
	public void onClick(ActionEvent event) {
	
		System.out.println("Нажата кнопка");
		n++;
		button1.setText("Вы нажали " + n + " раз");
	}
}
