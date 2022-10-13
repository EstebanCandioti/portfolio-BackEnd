/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.yoprogramo.practicacollections;


import java.util.*;

/**
 *
 * @author esteban
 */
public class PracticaCollections2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List <Persona> lista= new LinkedList<Persona>();
        List <Persona> menores= new LinkedList<Persona>();
        List <Persona> mayores= new LinkedList<Persona>();
        
        lista.add(new Persona(1,"a","a", "1", "1", 21));
        lista.add(new Persona(2,"b","b", "2", "2", 16));
        lista.add(new Persona(3,"c","c", "3", "3", 19));
        lista.add(new Persona(4,"d","d", "4", "4", 15));
        lista.add(new Persona(5,"e","e", "5", "5", 33));
        lista.add(new Persona(6,"f","f", "6", "6", 9));
        lista.add(new Persona(7,"g","g", "7", "7", 15));
        lista.add(new Persona(8,"h","h", "8", "8", 29));
        lista.add(new Persona(9,"i","i", "9", "9", 41));
        lista.add(new Persona(10,"j","j", "10", "10", 27));
        
        int mayorEdad=18;
        for(int i=0; i<lista.size(); i++){
            if (lista.get(i).getEdad()>=mayorEdad){
                mayores.add(new Persona(
                lista.get(i).getDni(),
                lista.get(i).geNombre(),
                lista.get(i).getApellido(),
                lista.get(i).getDireccion(),
                lista.get(i).getCelular(),
                lista.get(i).getEdad()
                ));
            }else{
                menores.add(new Persona(
                lista.get(i).getDni(),
                lista.get(i).geNombre(),
                lista.get(i).getApellido(),
                lista.get(i).getDireccion(),
                lista.get(i).getCelular(),
                lista.get(i).getEdad()
                ));
            
            }
        }
        System.out.println("Los mayores son: ");
        for (Persona list: mayores){
            System.out.println(list.geNombre()+list.getApellido()+list.getEdad());
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Los menores son: ");
        for (Persona list: menores){
            System.out.println(list.geNombre()+list.getApellido()+list.getEdad());
        }
    }
    
}

