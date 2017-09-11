package com.metodologia.sistemapelotero;

import java.io.IOException;

import javafx.application.Application;
import javafx.application.Preloader;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Preloader {
	private Stage stage;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("view/PreLoader.fxml"));
		Scene scene = new Scene(root);

		primaryStage.setScene(scene);
		Parent bienvenida = null;
		Stage inicio = new Stage();
		
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.show();
		// primaryStage.setMaximized(true);

	}

}
