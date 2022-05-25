/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.sql.*;
import javafx.collections.ObservableList;

/**
 *
 * @author Nacho
 */
public class PaisModel extends DBUtil{
    
    public ObservableList<Pais> getPaises() {
		
		ObservableList<Pais> listaPaises = null;
		
		try {
			//Introduce la consulta SQL.    cambiar los datos del usuario
			String sql = "SELECT id,nombre FROM paises";
			PreparedStatement stmt = this.getConexion().prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();  
		
			while(rs.next()) {
				
                            int id = rs.getInt("id");
                            String nombre = rs.getString("nombre");
                            
                            Pais p = new Pais(id,nombre);
                            listaPaises.add(p);
                            
			}
			
			return listaPaises;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} 
		finally {
			//Cerramos conexión
			this.cerrarConexion();
		}
	}
    
}
