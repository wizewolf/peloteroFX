package com.metodologia.sistemapelotero.controller;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import com.metodologia.sistemapelotero.modelos.ClientesJson;
import com.metodologia.sistemapelotero.modelos.Direccion;
import com.metodologia.sistemapelotero.modelos.REST.RESTCliente;
import com.metodologia.sistemapelotero.modelos.entity.ClienteVo;
import com.metodologia.sistemapelotero.modelos.entity.UsuariosVo;

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
	private Button btnCerrarClientes;

	@FXML
	private TableView<ClienteVo> tableClientes;

	@FXML
	private TableColumn<ClienteVo, String> columNombre;

	@FXML
	private TableColumn<ClienteVo, String> columApellido;

	@FXML
	private TableColumn<ClienteVo, String> columId;

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
	private Button bntaltaCliente;

	@FXML
	private Button bntCancelar;
	@FXML
	private AnchorPane anchorPaneClientes;
	@FXML
    private AnchorPane anchorUsuario;

    @FXML
    private TextField txtUsuario;

    @FXML
    private TextField txtContraseña;

    @FXML
    private Button bntAceptar1;

    @FXML
    private Button bntCancelar2;

    @FXML
    private Button bntaltaCliente1;

    @FXML
    private Button bntBajaUsuario;

    @FXML
    private TableView<UsuariosVo> tablaUsuario;

    @FXML
    private TableColumn<UsuariosVo, String> columUsuarioId;

    @FXML
    private TableColumn<UsuariosVo, String> columUsuarioUsuario;

    @FXML
    private TableColumn<UsuariosVo, String> columUsuarioContraseña;

    @FXML
    private TableColumn<UsuariosVo, String> columUsuarioNombre;

    @FXML
    private TableColumn<UsuariosVo, String> columUsuarioMail;

	// <------ EndRegion de los controladores del FX --->
	// <------ Region de los Atrivutos --->
	public boolean UsuarioAdmin;
	private Stage dialogStage;
	private String str;
	private ObservableList<ClienteVo> personsData = FXCollections.observableArrayList();
	private ClienteVo cliente;

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
		// System.out.println("entro");
		// try {
		// System.out.println("entro");
		// Parent root;
		// FXMLLoader loader = new
		// FXMLLoader(getClass().getResource("../view/TodosClientes.fxml"));
		// root = loader.load();
		// Scene scene = new Scene(root);
		// Stage clientesTodos = new Stage();
		//
		// ClientesController clientesController = (ClientesController)
		// loader.getController();
		// clientesController.setDialogStage(clientesTodos);
		// clientesTodos.setScene(scene);
		// clientesTodos.setTitle("Lista de Clientes");
		// clientesTodos.setResizable(false);
		// clientesTodos.show();
		//
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		cargarTabla();
		anchorPaneClientes.setVisible(true);
	}

	private void cargarTabla() {
		columId.setCellValueFactory(cellData -> cellData.getValue().getId());
		columDNI.setCellValueFactory(cellData -> cellData.getValue().getDni());
		columNombre.setCellValueFactory(cellData -> cellData.getValue().getNombre());
		columApellido.setCellValueFactory(cellData -> cellData.getValue().getApellido());
		columTelefono.setCellValueFactory(cellData -> cellData.getValue().getTelefono());
		columCalle.setCellValueFactory(cellData -> cellData.getValue().getCalle());
		columAltura.setCellValueFactory(cellData -> cellData.getValue().getAltura());
		columPsio.setCellValueFactory(cellData -> cellData.getValue().getPiso());
		columNroDpt.setCellValueFactory(cellData -> cellData.getValue().getNroDepartamento());
		columMil.setCellValueFactory(cellData -> cellData.getValue().getMail());
		columCelular.setCellValueFactory(cellData -> cellData.getValue().getCelular());
		columOtIn.setCellValueFactory(cellData -> cellData.getValue().getOtraInf());
		try {
			List<ClientesJson> listCliente = RESTCliente.getClientes();
			personsData.clear();
			System.out.println("------------------->");
			System.out.println(listCliente);
			for (ClientesJson clientesJson : listCliente) {
				personsData.add(new ClienteVo(clientesJson.getId(), clientesJson.getCuil(), clientesJson.getnombre(),
						clientesJson.getApellido(), clientesJson.getTelefono(), clientesJson.getEmail(),
						clientesJson.getOtraInformacion(), clientesJson.getCelular(), clientesJson.getDireccion()));
			}
			;
			System.out.println(personsData);
			tableClientes.setItems(personsData);
			// Clear person details.
			showCustomerDetails(null);
			// Listen for selection changes and show the person details when changed.
			tableClientes.getSelectionModel().selectedItemProperty()
					.addListener((observable, oldValue, newValue) -> showCustomerDetails(newValue));
		} catch (Exception e) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Error");
			alert.setContentText("Compruebe su conexion de internet e intenet nuevamente");
			alert.show();
		}

	}

	private void showCustomerDetails(ClienteVo persona) {
		if (persona != null) {
			this.cliente = persona;
			// Fill the labels with info from the person object.
			txtDni.setText(persona.getDni().getValue());
			txtNombre.setText(persona.getNombre().getValue());
			txtApellido.setText(persona.getApellido().getValue());
			txtCelular.setText(persona.getCelular().getValue());
			txtCalle.setText(persona.getCalle().getValue());
			txtAltura.setText(persona.getAltura().getValue());
			txtPiso.setText(persona.getPiso().getValue());
			txtNro.setText(persona.getNroDepartamento().getValue());
			txtTelefono.setText(persona.getTelefono().getValue());
			txtMail.setText(persona.getMail().getValue());
			txtOInf.setText(persona.getOtraInf().getValue());
			bntaltaCliente.setVisible(false);
			bntaltaCliente.setDisable(true);
			bntAceptar.setVisible(true);
			bntAceptar.setDisable(false);
			bntCancelar.setVisible(true);
			bntCancelar.setDisable(false);
			bntBaja.setVisible(true);
			bntBaja.setDisable(false);
			// refrescaTablas();

		} else {
			// Person is null, remove all the text.
			bntaltaCliente.setVisible(true);
			bntaltaCliente.setDisable(false);
			bntAceptar.setVisible(false);
			bntAceptar.setDisable(true);
			bntCancelar.setVisible(false);
			bntCancelar.setDisable(true);
			bntBaja.setVisible(false);
			bntBaja.setDisable(true);
			txtDni.setText("");
			txtNombre.setText("");
			txtApellido.setText("");
			txtCelular.setText("");
			txtCalle.setText("");
			txtAltura.setText("");
			txtPiso.setText("");
			txtNro.setText("");
			txtTelefono.setText("");
			txtMail.setText("");
			txtOInf.setText("");
		}
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

	// -------------Modulo Cliente------------- //
	@FXML
	void bajaCliente(ActionEvent event) {
		if (RESTCliente.deteCliente(Integer.valueOf(cliente.getId().getValue()))) {
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("Baja del CLIENTE con exito");
			alert.setContentText("La operacion se completo con exito");
			alert.show();
			cargarTabla();
		} else {
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("Error en la baja del Cliente");
			alert.show();
		}

	}

	@FXML
	void cerrarGestionCliente(ActionEvent event) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("¿Desea terminar?");
		alert.setHeaderText("¿Desea terminar con la gestion de clientes?");
		ButtonType btAceptar = new ButtonType("Aceptar");
		ButtonType btCancelar = new ButtonType("Cancelar");
		alert.getButtonTypes().setAll(btAceptar, btCancelar);
		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == btAceptar) {
			anchorPaneClientes.setVisible(false);
		} else {
			// ... user chose CANCEL or closed the dialog
		}

	}

	@FXML
	void modficarCliente(ActionEvent event) {
		if (txtDni.getLength() != 0 && txtNombre.getLength() != 0 && txtApellido.getLength() != 0
				&& txtCelular.getLength() != 0) {
			ClientesJson clienteOK = cargarCliente();
			if (RESTCliente.putClienteModificar(clienteOK)) {
				Alert alert = new Alert(Alert.AlertType.INFORMATION);
				alert.setTitle("Se modifico del CLIENTE con exito");
				alert.setContentText("La operacion se completo con exito");
				alert.show();
				cargarTabla();
			} else {
				Alert alert = new Alert(Alert.AlertType.INFORMATION);
				alert.setTitle("Error en al modificar del Cliente");
				alert.show();
			}
		}
	}

	@FXML
	void cancelarAltaCliente(ActionEvent event) {
		showCustomerDetails(null);

	}

	@FXML
	void altaCliente(ActionEvent event) {
		if (txtDni.getLength() != 0 && txtNombre.getLength() != 0 && txtApellido.getLength() != 0
				&& txtCelular.getLength() != 0) {
			ClientesJson clienteOK = cargarCliente();
			if (RESTCliente.postClienteAdd(clienteOK)) {
				Alert alert = new Alert(Alert.AlertType.INFORMATION);
				alert.setTitle("Alta del CLIENTE con exito");
				alert.setContentText("La operacion se completo con exito");
				alert.show();
			}
			cargarTabla();
		} else {
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("Error en la carga del Cliente");
			alert.setContentText("Los campos no tienen que estar vacios");
			alert.show();
		}

	}

	private ClientesJson cargarCliente() {
		ClientesJson clienteOK = new ClientesJson();
		Direccion direccion = new Direccion();
		direccion.setPiso(Integer.parseInt(txtPiso.getText()));
		direccion.setAltura(txtAltura.getText());
		direccion.setCalle(txtCalle.getText());
		direccion.setNroDepartamento(txtNro.getText());
		clienteOK.setApellido(txtApellido.getText());
		clienteOK.setNombre(txtNombre.getText());
		clienteOK.setCuil(txtDni.getText());
		clienteOK.setOtraInformacion(txtOInf.getText());
		clienteOK.setEmail(txtMail.getText());
		clienteOK.setTelefono(txtTelefono.getText());
		clienteOK.setDireccion(direccion);
		clienteOK.setCelular(txtCelular.getText());
		return clienteOK;
	}
	// -------------FIN Modulo Cliente------------- //
	// <------ endRegion de los metodos FMXL --->
}
