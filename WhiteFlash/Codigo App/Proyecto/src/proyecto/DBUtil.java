/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.sql.*;

/**
 *
 * @author Nacho
 */
public class DBUtil {
    
    private Connection conn;
	private String cadenaConexion = "jdbc:mysql://44.194.37.192:3306/whit_whiteflashDataBase";
	private String nombreUsuario = "whit_Admin";
	private String password = "1234567";
	
	public Connection getConexion() {
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			this.conn = DriverManager.getConnection(this.cadenaConexion, this.nombreUsuario, this.password);
			return this.conn;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void cerrarConexion() {
		try {
			this.conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
    
}
