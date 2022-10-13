/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.practicacollections;

/**
 *
 * @author esteban
 */
public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String celular;
    private int edad;
    
    public Persona(){
    }
    
    public Persona (int dni, String nombre, String apellido, String direccion, String celular, int edad){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.direccion=direccion;
        this.celular=celular;
        this.edad=edad;
    }
    
    public void setDni (int dni){
        this.dni=dni;
    }
    
    public int getDni (){
        return this.dni;
    }
    
    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    
    public String geNombre (){
        return this.nombre;
    }
    
    public void setApellido (String apellido){
        this.apellido=apellido;
    }
    
    public String getApellido (){
        return this.apellido;
    }
    
    public void setDireccion (String direccion){
        this.direccion=direccion;
    }
    
    public String getDireccion (){
        return this.direccion;
    }
    
    public void setCelular (String celular){
        this.celular=celular;
    }
    
    public String getCelular (){
        return this.celular;
    }
    
    public void setEdad (int edad){
        this.edad=edad;
    }
    
    public int getEdad (){
        return this.edad;
    }
}
