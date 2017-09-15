package com.metodologia.sistemapelotero.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.metodologia.sistemapelotero.modelos.entity.ClienteVo;

public class MainController implements Initializable {
	// <------ Region de los controladores del FX --->
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

	@FXML
	private HBox hBox;

	@FXML
	private Button bntBaja;

	@FXML
	private Button bntModificacion;

	@FXML
	private TableView<ClienteVo> tableClientes;

	@FXML
	private TableColumn<ClienteVo, String> columNombre;

	@FXML
	private TableColumn<ClienteVo, String> columApellido;

	@FXML
	private TableColumn<ClienteVo, String> columDNI;

	@FXML
	private TableColumn<ClienteVo, String> columDireccion;

	@FXML
	private TableColumn<ClienteVo, String> columCalle;

	@FXML
	private TableColumn<ClienteVo, String> columAltura;

	@FXML
	private TableColumn<ClienteVo, String> columPsio;

	@FXML
	private TableColumn<ClienteVo, String> columNroDpt;

	@FXML
	private TableColumn<ClienteVo, String> columMil;

	@FXML
	private TableColumn<ClienteVo, String> columTelefono;

	@FXML
	private TableColumn<ClienteVo, String> columOtIn;

	@FXML
	private TableColumn<ClienteVo, String> columCelular;

	@FXML
	private TextField txtDni;

	@FXML
	private TextField txtNombre;

	@FXML
	private TextField txtApellido;

	@FXML
	private TextField txtCelular;

	@FXML
	private TextField txtCalle;

	@FXML
	private TextField txtAltura;

	@FXML
	private TextField txtPiso;

	@FXML
	private TextField txtNro;

	@FXML
	private TextField txtTelefono;

	@FXML
	private TextField txtMail;

	@FXML
	private TextField txtOInf;

	@FXML
	private Button bntAceptar;

	@FXML
	private Button bntCancelar;
	@FXML
    private AnchorPane anchorPaneClientes;
	// <------ EndRegion de los controladores del FX --->
	// <------ Region de los Atrivutos --->
	public boolean UsuarioAdmin;
	private Stage dialogStage;
	private String str;

	// <------ EndRegion de los atrivutos --->
	// <------ Region de los metodos set/get/initialize --->
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

	// <------ endRegion de los set/get/initialize --->
	// <------ Region de los metodos FMXL --->
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
			fichacliente.setTitle("Ficha Cliente");
			fichacliente.setScene(scene);
			fichacliente.setResizable(false);
			fichacliente.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@FXML
	void MostrarAll(ActionEvent event) {
//		System.out.println("entro");
//		try {
//			System.out.println("entro");
//			Parent root;
//			FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/TodosClientes.fxml"));
//			root = loader.load();
//			Scene scene = new Scene(root);
//			Stage clientesTodos = new Stage();
//
//			ClientesController clientesController = (ClientesController) loader.getController();
//			clientesController.setDialogStage(clientesTodos);
//			clientesTodos.setScene(scene);
//			clientesTodos.setTitle("Lista de Clientes");
//			clientesTodos.setResizable(false);
//			clientesTodos.show();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		anchorPaneClientes.setVisible(true);
	}

	@FXML
	void GestionarUsuarios(ActionEvent event) {

	}

	@FXML
	void nuevoUsuario(ActionEvent event) {

	}

	@FXML
	void aceptar(ActionEvent event) {

	}

	@FXML
	void bajaCliente(ActionEvent event) {

	}

	@FXML
	void cerrarGestionCliente(ActionEvent event) {
		anchorPaneClientes.setVisible(false);
	}

	@FXML
	void modficarCliente(ActionEvent event) {

	}

	// <------ endRegion de los metodos FMXL --->
}
