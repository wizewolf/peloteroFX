package com.metodologia.sistemapelotero.controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import com.metodologia.sistemapelotero.modelos.ClientesJson;
import com.metodologia.sistemapelotero.modelos.Direccion;
import com.metodologia.sistemapelotero.modelos.REST.RESTCliente;
import com.metodologia.sistemapelotero.modelos.entity.ClienteVo;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.fxml.Initializable;

public class FichaClienteController implements Initializable{
	private ClienteVo cliente;
	private Stage dialogStage;

    @FXML
    private Pane paneFichaClientes;

    @FXML
    private TextField txtDni;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextField txtMail;

    @FXML
    private TextField txtOInf;
    @FXML
    private Button btnCancelar;
    @FXML
    private Button btnAceptar;
    @FXML
    private TextField txtCalle;

    @FXML
    private TextField txtAltura;

    @FXML
    private TextField txtPiso;

    @FXML
    private TextField txtNro;
    @FXML
    private TextField txtCelular;
    
    @FXML
    void aceptar(ActionEvent event) {
    	if (cliente ==null) {
    		if (txtDni.getText().length()>0&&txtNombre.getText().length()>0&&txtApellido.getText().length()>0&&txtTelefono.getText().length()>0) {
        		ClienteVo clienteOK = new ClienteVo();
        		Direccion direccion = new Direccion();
        		direccion.setPiso(Integer.parseInt(txtPiso.getText()));
        		direccion.setAltura(txtAltura.getText());
        		direccion.setCalle(txtCalle.getText());
        		direccion.setNroDepartamento(txtNro.getText());
        		clienteOK.setApellido(txtApellido.getText());
        		clienteOK.setNombre(txtNombre.getText());
        		clienteOK.setDni(txtDni.getText());
        		clienteOK.setOtraInf(txtOInf.getText());
        		clienteOK.setMail(txtMail.getText());
        		clienteOK.setTelefono(txtTelefono.getText());
        		clienteOK.setDireccion(direccion);
        		clienteOK.setCelular(txtCelular.getText());
        		altacliente(clienteOK);
        		
    		}else {
				Alert alert = new Alert(Alert.AlertType.INFORMATION);
				alert.setTitle("Error en la carga del Cliente");
				alert.setContentText("Los campos no tienen que estar vacios");
				alert.show();
    		}
		}else {
			if (txtDni.getText().length()>0&&txtNombre.getText().length()>0&&txtApellido.getText().length()>0&&txtCelular.getText().length()>0) {
				Direccion direccion = new Direccion();
        		direccion.setPiso(Integer.parseInt(txtPiso.getText()));
        		direccion.setAltura(txtAltura.getText());
        		direccion.setCalle(txtCalle.getText());
        		direccion.setNroDepartamento(txtNro.getText());
        		cliente.setApellido(txtApellido.getText());
        		cliente.setNombre(txtNombre.getText());
        		cliente.setDni(txtDni.getText());
        		cliente.setCelular(txtCelular.getText());
        		cliente.setOtraInf(txtOInf.getText());
        		cliente.setMail(txtMail.getText());
        		cliente.setTelefono(txtTelefono.getText());
        		cliente.setDireccion(direccion);
        		altacliente(cliente);
        		
    		}else {
				Alert alert = new Alert(Alert.AlertType.INFORMATION);
				alert.setTitle("Error en la carga del Cliente");
				alert.setContentText("Los campos no tienen que estar vacios");
				alert.show();
			}
		}
    	
    	
    	
    }

    private void altacliente(ClienteVo clienteOK) {
		ClientesJson clienteJSON = new ClientesJson(clienteOK.getApellido(), clienteOK.getCelular(),clienteOK.getDni(),clienteOK.getMail(), clienteOK.getNombre(), clienteOK.getOtraInf(), clienteOK.getTelefono(), clienteOK.getDireccion());
    	if(RESTCliente.postClienteAdd(clienteJSON)){
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("Cliente Cargado");
			alert.setContentText("se cargo el cliente correctamente");
			alert.show();
		}else {
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("Error en la carga del Cliente");
			alert.show();
    	}

		
	}

	@FXML
    void cancelar(ActionEvent event) {
    	dialogStage.close();
    }
    
	public void initialize(URL location, ResourceBundle resources) {
		
	}

	public ClienteVo getCliente() {
		return cliente;
	}

	public void setCliente(ClienteVo cliente) {
		this.cliente = cliente;
		txtDireccion.setText(cliente.getDni());
		txtNombre.setText(cliente.getNombre());
		txtCalle.setText(cliente.getDireccion().getCalle());
		txtPiso.setText(""+cliente.getDireccion().getPiso());
		txtAltura.setText(""+cliente.getDireccion().getAltura());
		txtMail.setText(cliente.getMail());
		txtApellido.setText(cliente.getApellido());
		txtOInf.setText(cliente.getOtraInf());
	}

	public Stage getDialogStage() {
		return dialogStage;
	}

	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}

}
