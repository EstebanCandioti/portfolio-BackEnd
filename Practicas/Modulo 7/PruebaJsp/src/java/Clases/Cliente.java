/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author esteban
 */
public class Cliente {
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    
    public Cliente (){}
    public Cliente (String dni, String nombre, String apellido, String telefono){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
    }
    
    public String getDni(){
        return this.dni;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public String getTelefono(){
        return this.telefono;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
