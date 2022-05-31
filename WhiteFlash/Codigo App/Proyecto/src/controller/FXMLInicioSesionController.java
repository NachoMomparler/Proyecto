/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import model.UsuarioModel;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

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
    private Button botonAtras;
    @FXML
    private AnchorPane rootPane;
    @FXML
    private PasswordField passwordField;
    @FXML
    private CheckBox verCheckBox;
    @FXML
    private Label labelContraseña;
    

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
        String contraseña=passwordField.getText();
        
        if(um.login(correo, contraseña, listaUsuarios)==true){
            labelError.setText("");
            //entrar a la app
        }
        else{
            labelError.setText("El correo o contraseña no coincide, por favor intentelo otra vez");
        }
        
    }

    @FXML
    private void volverAtras(ActionEvent event) {
        
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/FXMLDocument.fxml"));
            this.rootPane.getChildren().setAll(pane);
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void mostrarContraseña(ActionEvent event) {
        
        if(verCheckBox.isSelected()){
            labelContraseña.setText(passwordField.getText());
        }
        else{
            labelContraseña.setText("");
        }
        
        
        
        
        
        
    }
    
}
