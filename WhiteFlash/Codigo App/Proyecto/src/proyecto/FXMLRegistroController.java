/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proyecto;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Nacho
 */
public class FXMLRegistroController implements Initializable {

    @FXML
    private TextField nombreT;
    @FXML
    private TextField apellidosT;
    @FXML
    private TextField contraseñaT;
    @FXML
    private TextField correoT;
    @FXML
    private TextField telefonoT;
    @FXML
     
   private TextField direccionT;
    @FXML
    private Pane paneContra;
    @FXML
    private TextField ciudadT;
    @FXML
    private ComboBox<ClaveValor> desplegablePais;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        PaisModel pm = new PaisModel();
        
       ObservableList<ClaveValor> listaPaises=pm.getPaisesCV();
        
       desplegablePais.setItems(listaPaises); //observable list de clave valor
        
        desplegablePais.getSelectionModel().getSelectedItem();  //devuelve string del seleccionado
    }    

    @FXML
    private void registrar(ActionEvent event) throws SQLException {
        
        UsuarioModel um = new UsuarioModel();
        ArrayList<Usuario> listaUsuarios = um.getUsuarios();
        
        String nombre=nombreT.getText();
        String apellidos=apellidosT.getText();
        String correo=correoT.getText();
        String contraseña=contraseñaT.getText();
        int telefono=Integer.parseInt(telefonoT.getText());
        String direccion=direccionT.getText();
        String ciudad=ciudadT.getText();
        
        
        
        
        String pais="";
        //falta el string de pais con el desplegable
        
        um.añadirCliente(nombre,apellidos,correo,contraseña,telefono,direccion,ciudad,pais,listaUsuarios);
        
        //Usuario uNuevo = new Usuario(nombre,apellidos,correo,contraseña,telefono,direccion);
        //listaUsuarios.add(uNuevo);
        
        nombreT.setText("");
        apellidosT.setText("");
        correoT.setText("");
        contraseñaT.setText("");
        telefonoT.setText("");
        direccionT.setText("");
        
        /*falta hacer la consulta para añadir 
        cuando se haga el registro puede mostrar una alerta si queremos
        y tambien tenemos que hacer que se cambie a la pagina de inicio de sesion*/
        
    }
    
}
