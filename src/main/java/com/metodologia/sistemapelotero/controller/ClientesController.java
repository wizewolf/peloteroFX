package com.metodologia.sistemapelotero.controller;

/**
 * Created by User on 11/09/2017.
 */
import com.metodologia.sistemapelotero.modelos.ClientesJson;
import com.metodologia.sistemapelotero.modelos.REST.RESTCliente;
import com.metodologia.sistemapelotero.modelos.entity.ClienteVo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ClientesController implements Initializable {
    private  Stage dialogStage;
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
    void alataCliente(ActionEvent event) {

    }

    @FXML
    void bajaCliente(ActionEvent event) {

    }

    @FXML
    void cancelar(ActionEvent event) {

    }

    @FXML
    void modficarCliente(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
        List<ClienteVo> listCliente = RESTCliente.getClientes();
        System.out.println("------------------->");
        listCliente.forEach(x -> personsData.add(new ClienteVo(x.getId(),x.getDni(),x.getNombre(),x.getApellido(),x.getDireccion(),x.getTelefono(),x.getMail(),x.getOtraInf())));
        tableClientes.setItems(personsData);

    }
}
