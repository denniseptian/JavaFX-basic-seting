package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class controllerMain {
	@FXML private TextField textFieldNama;
	@FXML private TextField textFieldEmail;
	@FXML private Button btnTampilkan;
	
	@FXML private void btnTampilkanOnClick(ActionEvent event){
		System.out.println(textFieldNama.getText());
		System.out.println(textFieldEmail.getText());
	}
}
