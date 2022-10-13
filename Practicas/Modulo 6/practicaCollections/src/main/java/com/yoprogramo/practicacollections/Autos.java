/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.practicacollections;

/**
 *
 * @author esteban
 */
public class Autos {
    private  String numPatente;
    private String marca;
    private String  modelo;
    private String color;
    private String chasis;
    
    public Autos (String numPatente, String marca, String modelo, String color, String chasis ){
        this.numPatente=numPatente;
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.chasis=chasis;
    }
    
    public Autos (){
    }
    
    public String getNumPatente (){
        return this.numPatente;
    }
    
    public void setNumPatente (String patente){
        this.numPatente=patente;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca (String marca){
        this.marca=marca;
    }
    
    public String getModelo (){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    
    public String getChasis (){
        return this.chasis;
    }
    
    public void setChasis(String chasis){
        this.chasis=chasis;
    }
}
