package com.metodologia.sistemapelotero.controller;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
	//<------ Region de los controladores del FX --->
	@FXML
	private AnchorPane panePrincipal;
	@FXML
	private Button btnNuevoUsuario;

	@FXML
	private Button btnModificarUsuario;

	@FXML
	private Button btnCerrarSesion;

	@FXML
	private Button btnSalir;

	@FXML
	private Button btnNuevoCliente;

	@FXML
	private Button btnTodosLosClientes;

	@FXML
	private Button btnCombos;

	@FXML
	private Button btnTematicas;

	@FXML
	private Button btnReserva;

	@FXML
	private Button btnVerReservaCliente;

	@FXML
	private Button btnBebidas;

	@FXML
	private Button btnCambiarPrecios;
	//<------ EndRegion de los controladores del FX --->
	//<------ Region de los Atrivutos --->
	public boolean UsuarioAdmin;
	private Stage dialogStage;
	private String str;
	//<------ EndRegion de los atrivutos --->
	//<------ Region de los metodos set/get/initialize --->
	public void initialize(URL location, ResourceBundle resources) {

	}

	public boolean isUsuarioAdmin() {
		return UsuarioAdmin;
	}

	public void setUsuarioAdmin(boolean UsuarioAdmin) {
		this.UsuarioAdmin = UsuarioAdmin;
		if (UsuarioAdmin) {

		} else {

		}
	}

	public Stage getDialogStage() {
		return dialogStage;
	}

	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	//<------ endRegion de los set/get/initialize --->
	//<------ Region de los metodos FMXL --->
	@FXML
	void Cerrar(ActionEvent event) {
		Platform.exit();
	}

	@FXML
	void CerrarSesion(ActionEvent event) {
		try {
			Parent root;
			root = FXMLLoader.load(getClass().getResource("../view/Login.fxml"));
			Scene scene = new Scene(root);
			Stage stageMain = new Stage();
			stageMain.setScene(scene);
			stageMain.show();
			panePrincipal.getScene().getWindow().hide();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@FXML
	void FichaCliente(ActionEvent event) {
		try {
			Parent root;
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/FichaCliente.fxml"));
			root = loader.load();
			Scene scene = new Scene(root);
			Stage fichacliente = new Stage();

			FichaClienteController fichaController = (FichaClienteController) loader.getController();
			fichaController.setDialogStage(fichacliente);
			fichacliente.setScene(scene);
			fichacliente.setResizable(false);
			fichacliente.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	@FXML
	void MostrarAll(ActionEvent event) {
		System.out.println("entro");
		try {
			System.out.println("entro");
			Parent root;
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/TodosClientes.fxml"));
			root = loader.load();
			Scene scene = new Scene(root);
			Stage clientesTodos = new Stage();

			ClientesController clientesController = (ClientesController) loader.getController();
			clientesController.setDialogStage(clientesTodos);
			clientesTodos.setScene(scene);
			clientesTodos.setTitle("Lista de Clientes");
			clientesTodos.setResizable(false);
			clientesTodos.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	void GestionarUsuarios(ActionEvent event) {

	}

	@FXML
	void nuevoUsuario(ActionEvent event) {

	}
	//<------ endRegion de los metodos FMXL --->
}
