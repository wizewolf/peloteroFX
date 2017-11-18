package com.metodologia.sistemapelotero.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.metodologia.sistemapelotero.modelos.UsuarioJson;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class Login {
	@FXML
	private TextField txtUsuario;
	@FXML
	private Pane panelLogin;

	@FXML
	private PasswordField txtPass;

	@FXML
	private Button btnAceptar;

	@FXML
	private Button btnCancelar;

	@FXML
	void aceptar(ActionEvent event) {
		String usuario = txtUsuario.getText();
		String pass = txtPass.getText();
		if (!usuario.equals("") && !pass.equals("")) {
			try {
								Stage stageMain = new Stage();
								
				FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/Main.fxml"));
				AnchorPane borderPaneMain = (AnchorPane) loader.load();
				MainController mainController = (MainController) loader.getController();
			//	mainController.setUsuarioAdmin(true);
				Scene scene = new Scene(borderPaneMain);
				stageMain.setTitle("Travesuras Infantiles");
				stageMain.setScene(scene);
				stageMain.setMaximized(true);
				System.out.println(MainController.usuarios.toString());
				/*
				for (UsuarioJson usuariosJason : MainController.usuarios) {
					System.out.println("usurJSO"+usuariosJason.getUsername());
					System.out.println("usur"+usuario);
					System.out.println("pass"+pass);
					
					if (usuariosJason.getUsername().equals(usuario) && usuariosJason.getPassword().equals(pass)) {
						System.out.println("encontro usuario");
						mainController.setUsuario(usuariosJason);
						if (usuariosJason.isAdmin()) {
							System.out.println("es admin");
							mainController.setUsuarioAdmin(true);
						}else {
							System.out.println("no es admin");
							mainController.setUsuarioAdmin(false);
						}
						stageMain.show();
						panelLogin.getScene().getWindow().hide();
					}else {
						System.out.println("no");
					}
				}*/
				if (usuario.equals("admin") && pass.equals("admin")) {					
					mainController.setUsuarioAdmin(true);
				}else {
					mainController.setUsuarioAdmin(false);
				}
				
				
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

	@FXML
	void cerrar(ActionEvent event) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("¿Desea salir?");
		alert.setHeaderText("¿Desea salir de la aplicacion?");

		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == ButtonType.OK) {
			Platform.exit();
		} else {
			// ... user chose CANCEL or closed the dialog
		}

	}
}
