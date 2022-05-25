/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Nacho
 */
public class Usuario {
    
    //hay que hacer cuando este la base de datos el metodo de getUsuarios
    
    private int id;
    private String nombre;
    private String Apellidos;
    private String correo;
    private String contraseña;
    private int telefono;
    private String direccion;
    private String ciudad;
    private String pais;
    private boolean admin=false;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean getAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    
    public Usuario(){
        
    }
    //constructor uso defecto para usuarios normales con id

    public Usuario(int id, String nombre, String Apellidos, String correo, String contraseña, int telefono, String direccion, String ciudad, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.Apellidos = Apellidos;
        this.correo = correo;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
    }
    
    //constuctor uso defecto para usuarios normales pero sin id
    public Usuario(String nombre, String Apellidos, String correo, String contraseña, int telefono, String direccion, String ciudad, String pais) {
        this.nombre = nombre;
        this.Apellidos = Apellidos;
        this.correo = correo;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
    }
    //constructor admin esta opcion es solo para admin
    public Usuario(int id, String nombre, String Apellidos, String correo, String contraseña, int telefono, String direccion, String ciudad, String pais, boolean admin) {
        this.id = id;
        this.nombre = nombre;
        this.Apellidos = Apellidos;
        this.correo = correo;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.admin = admin;
    }
    public Usuario(String nombre, String Apellidos, String correo, String contraseña, int telefono, String direccion, String ciudad, String pais, boolean admin) {
        this.nombre = nombre;
        this.Apellidos = Apellidos;
        this.correo = correo;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.admin = admin;
    }
}
