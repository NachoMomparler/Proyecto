/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package registro;

import proyecto.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Nacho
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField correoLogin;
    @FXML
    private TextField contraseñaLogin;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO  
    }   

    @FXML
    private void login(ActionEvent event) {
        
        //Codigo funcional pero falta enlazarlo con arraylist base de datos
        
        Usuario u = new Usuario("Ferran","Badia Valls","ferranbadia@gmail.com","12345",612345678,"Calle Sueca, Albalat Valencia",true);
        
        
        if(correoLogin.getText().equals(u.getCorreo()) && contraseñaLogin.getText().equals(u.getContraseña())){
            System.out.println("Programa");
            
            //if para comprobar si el usuario que ha iniciado es admin o no para mostrar mas funciones
            if(u.getAdmin()==true){
                System.out.println("Es admin");
            }
        }
        else{
            Alert a = new Alert(Alert.AlertType.ERROR);
            
            a.setHeaderText("¡¡¡Error!!!");
            a.setContentText("El usuario o la contraseña no coinciden");
            
            a.showAndWait();
        }
          
    }
    
    
    
}
