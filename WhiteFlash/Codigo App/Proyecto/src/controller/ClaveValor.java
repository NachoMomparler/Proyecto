/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Nacho
 */
public class ClaveValor {
    
    //esta clase se utilizara para todos los observable list que se añaden al combobox
    
    
    private int id;
    private String valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    
    public ClaveValor(int id, String valor) {
        this.id = id;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return  valor;
    }

}
