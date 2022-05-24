/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Nacho
 */
public class UsuarioModel extends DBUtil{
    
    	public ArrayList<Usuario> getUsuarios() {
		
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		try {
			//Introduce la consulta SQL.    cambiar los datos del usuario
			String sql = "SELECT id,nombre,categoria,precio,sede FROM juegos ";
			PreparedStatement stmt = this.getConexion().prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();  
		
			while(rs.next()) {
				
				int id=rs.getInt("id");
				String nombre=rs.getString("nombre");
				String categoria=rs.getString("categoria");
				double precio=rs.getDouble("precio");
				String sede=rs.getString("sede");
				
				Usuario u = new Usuario();
				
				listaUsuarios.add(u);
			}
			
			return listaUsuarios;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} 
		finally {
			//Cerramos conexión
			this.cerrarConexion();
		}
	}
        
        public boolean login(String correo, String contraseña,ArrayList<Usuario> listaUsuarios){
            
            boolean resultado=false;
            
            for(Usuario u:listaUsuarios){
                
                if(u.getCorreo().equalsIgnoreCase(correo) && u.getContraseña().equalsIgnoreCase(contraseña)){
                    resultado=true;
                }   
            }
            
            return resultado;
        }
    
    
}
