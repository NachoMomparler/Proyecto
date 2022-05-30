/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;


/**
 *
 * @author Nacho
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private AnchorPane rootPane;
    @FXML
    private Button registroButton;
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO  
        
    }   

    @FXML
    private void inicioSesion(ActionEvent event) {
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/FXMLInicioSesion.fxml"));
            this.rootPane.getChildren().setAll(pane);
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void registro(ActionEvent event) {
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/FXMLRegistro.fxml"));
            this.rootPane.getChildren().setAll(pane);
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void registroButtonAction(ActionEvent event) {
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/FXMLRegistro.fxml"));
            this.rootPane.getChildren().setAll(pane);
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
