/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.Usuario;
import java.sql.*;
import java.util.ArrayList;
import controller.Usuario;
import controller.Usuario;

/**
 *
 * @author Nacho
 */
public class UsuarioModel extends DBUtil{
    
    	public ArrayList<Usuario> getUsuarios() {
		
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		try {
			//Introduce la consulta SQL.    cambiar los datos del usuario
			String sql = "SELECT id,nombre,apellidos,email,contrasenya,telefono,direccion,ciudad,pais,admin FROM clientes ";
			PreparedStatement stmt = this.getConexion().prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();  
		
			while(rs.next()) {
				
				int id=rs.getInt("id");
				String nombre=rs.getString("nombre");
				String apellidos=rs.getString("apellidos");
                                String correo=rs.getString("email");
                                String contraseña=rs.getString("contrasenya");
				int telefono=rs.getInt("telefono");
				String direccion=rs.getString("direccion");
                                String ciudad=rs.getString("ciudad");
                                int pais=rs.getInt("pais");
                                int admin=rs.getInt("admin");
				
				Usuario u = new Usuario(id,nombre,apellidos,correo,contraseña,telefono,direccion,ciudad,pais,admin);
				
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

        public void añadirCliente(String nombre, String apellidos, String correo, String contrasenya, int telefono, String direccion, String ciudad, int pais, ArrayList<Usuario> listaUsuarios) {
        
            
           try{
           String sql = "INSERT INTO clientes(nombre,apellidos,email,contrasenya,telefono,direccion,ciudad,pais,admin) VALUES('"+nombre+"', '"+apellidos+"', '"+correo+"', '"+contrasenya+"', "+telefono+", '"+direccion+"', '"+ciudad+"', '"+pais+"', 0)";
           PreparedStatement ps=this.getConexion().prepareStatement(sql);
           
          /* ps.setString(1, nombre);
           ps.setString(2, apellidos);
           ps.setString(3, correo);
           ps.setString(4, contrasenya);
           ps.setInt(5, telefono);
           ps.setString(6, direccion);
           ps.setString(7, ciudad);
           ps.setString(8, pais);
           ps.setInt(9, 0);*/
           
          
           ps.executeUpdate(sql);
           
           this.cerrarConexion();
       } catch(SQLException e) {
           e.printStackTrace();
       }
          
          
        }
    
    
}
