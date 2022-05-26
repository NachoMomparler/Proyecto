/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import model.UsuarioModel;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Nacho
 */
public class FXMLInicioSesionController implements Initializable {

    @FXML
    private TextField correoT;
    @FXML
    private Label labelError;
    @FXML
    private TextField contraseñaT;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void inicio(ActionEvent event) {
        
        UsuarioModel um = new UsuarioModel();
        ArrayList<Usuario> listaUsuarios = um.getUsuarios();
        
        String correo=correoT.getText();
        String contraseña=contraseñaT.getText();
        
        if(um.login(correo, contraseña, listaUsuarios)==true){
            //cambiar a la pagina de la aplicacion
        }
        else{
            labelError.setText("El correo o contraseña no coincide, por favor intentelo otra vez");
        }
        
    }
    
}
