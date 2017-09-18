package com.metodologia.sistemapelotero.controller;

/**
 * Created by User on 11/09/2017.
 */
import com.metodologia.sistemapelotero.modelos.ClientesJson;
import com.metodologia.sistemapelotero.modelos.REST.RESTCliente;
import com.metodologia.sistemapelotero.modelos.entity.ClienteVo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableView.ResizeFeatures;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ClientesController implements Initializable {
	private Stage dialogStage;
	private ObservableList<ClienteVo> personsData = FXCollections.observableArrayList();

	@FXML
	private Button btnAlta;

	@FXML
	private Button bntBaja;

	@FXML
	private Button bntModificacion;

	@FXML
	private Button bntCancelar;

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
	void alataCliente(ActionEvent event) {
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
	void bajaCliente(ActionEvent event) {

	}

	@FXML
	void cancelar(ActionEvent event) {
		dialogStage.close();
	}

	@FXML
	void modficarCliente(ActionEvent event) {
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

	@Override
	public void initialize(URL location, ResourceBundle resources) {

//		columDNI.setCellValueFactory(cellData -> cellData.getValue().getDni());
//		columNombre.setCellValueFactory(cellData -> cellData.getValue().getNombre());
//		columApellido.setCellValueFactory(cellData -> cellData.getValue().getApellido());
//		columTelefono.setCellValueFactory(cellData -> cellData.getValue().getTelefono());
//		columCalle.setCellValueFactory(cellData -> cellData.getValue().getCalle());
//		columAltura.setCellValueFactory(cellData -> cellData.getValue().getAltura());
//		columPsio.setCellValueFactory(cellData -> cellData.getValue().getPiso());
//		columNroDpt.setCellValueFactory(cellData -> cellData.getValue().getNroDepartamento());
//		columMil.setCellValueFactory(cellData -> cellData.getValue().getMail());
//		columCelular.setCellValueFactory(cellData -> cellData.getValue().getCelular());
//		columOtIn.setCellValueFactory(cellData -> cellData.getValue().getOtraInf());
//
//		List<ClientesJson> listCliente = RESTCliente.getClientes();
//		personsData.clear();
//		System.out.println("------------------->");
//		System.out.println(listCliente);
//		for (ClientesJson clientesJson : listCliente) {
//			personsData.add(new ClienteVo(clientesJson.getCuil(), clientesJson.getnombre(), clientesJson.getApellido(),
//					clientesJson.getTelefono(), clientesJson.getEmail(), clientesJson.getOtraInformacion(),
//					clientesJson.getCelular(), clientesJson.getDireccion()));
//		}
//		;
//		System.out.println(personsData);
//		tableClientes.setItems(personsData);
	}

	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;

	}
}
