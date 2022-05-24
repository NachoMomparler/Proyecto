/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author Nacho
 */
public class Main_funciones {
    public static void main(String[] args){
       //String nombre, String Apellidos, String correo, int telefono, String direccion, boolean admin 
        
       Scanner sc = new Scanner(System.in);
       
       Usuario u = new Usuario("Ferran","Badia Valls","ferranbadia@gmail.com","12345",612345678,"Calle Sueca, Albalat Valencia",true);
         
        boolean login=false;
        
        System.out.println("Dime correo");
        String correo=sc.nextLine();
        System.out.println("Dime contraseña");
        String contraseña=sc.nextLine();
        
        if(correo.equals(u.getCorreo()) && contraseña.equals(u.getContraseña())){
            login=true;
        }
        
        if(login=true){
            
            System.out.println("Programa");
            
            //if para comprobar si el usuario que ha iniciado es admin o no para mostrar mas funciones
            if(u.getAdmin()==true){
                System.out.println("Es admin");
            }
            
            
        }
    }
}
