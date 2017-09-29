package com.metodologia.sistemapelotero.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.metodologia.sistemapelotero.App;
import com.metodologia.sistemapelotero.modelos.REST.RESTCliente;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class PreLoader implements Initializable {
	@FXML
	private Pane panelBienvenida;
	@FXML
	private ImageView peloteroLogo;

	public void initialize(URL location, ResourceBundle resources) {

		FadeTransition fadeIn = new FadeTransition();
		fadeIn.setDuration(Duration.seconds(4));
		fadeIn.setNode(peloteroLogo);
		fadeIn.setFromValue(0.0);
		fadeIn.setToValue(1.0);
		fadeIn.play();

		TranslateTransition translation = new TranslateTransition();
		translation.setDuration(Duration.seconds(4));
		translation.setNode(peloteroLogo);
		translation.setFromX(-164);
		translation.setToX(14);
		translation.play();

		new SplashScreen().start();

	}

	class SplashScreen extends Thread {
		@Override
		public void run() {
			try {

				//Thread.sleep(5000);
				MainController.usuarios=RESTCliente.getUsuarios();
				Platform.runLater(new Runnable() {

					public void run() {

						try {
							Parent root;
							root = FXMLLoader.load(getClass().getResource("../view/Login.fxml"));
							Scene scene = new Scene(root);
							Stage stageMain = new Stage();
							stageMain.setScene(scene);
							stageMain.show();
							panelBienvenida.getScene().getWindow().hide();
						} catch (IOException e) {

							e.printStackTrace();
						}

					}
				});

			} catch (Exception e) {
				System.out.println("InterruptedException");
				e.printStackTrace();
			}
		}
	}
}
