/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.practicacollections;

/**
 *
 * @author esteban
 */
public class Mascota {
        private String nombre;
        private String especie;
        private String sexo;
        private String color;
        private String pelaje;
        private String raza;
        
        public Mascota (String esp, String sex,String col, String pel, String raz, String nom){
            this.especie=esp;
            this.sexo=sex;
            this.color=col;
            this.pelaje=pel;
            this.raza=raz;
            this.nombre=nom;
        }
        public  Mascota (){
        }
        
        public void setNombre( String nombre){
            this.nombre=nombre;
        }
        
        public String getNombre (){
            return this.nombre;
        }
        
        public void setEspecie( String especie){
            this.especie=especie;
        }
        
        public String getEspecie (){
            return this.especie;
        }
        
        public void setSexo( String sexo){
            this.sexo=sexo;
        }
        
        public String getSexo (){
            return this.sexo;
        }
        
        public void setColor( String color){
            this.color=color;
        }
        
        public String getColor (){
            return this.color;
        }
        
        public void setPelaje( String pelaje){
            this.pelaje=pelaje;
        }
        
        public String getPelaje (){
            return this.pelaje;
        }
        
        public void setRaza( String raza){
            this.raza=raza;
        }
         
        public String getRaza (){
            return this.raza;
        }
    }
   
