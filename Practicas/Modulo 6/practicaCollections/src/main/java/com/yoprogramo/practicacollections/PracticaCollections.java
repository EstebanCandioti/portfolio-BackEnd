/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.yoprogramo.practicacollections;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author esteban
 */
public class PracticaCollections {

    public static void main(String[] args) {
        List <Mascota> mascotas= new ArrayList <Mascota>();
       
        mascotas.add(new Mascota("perro", "masculino", "blanco","corto","dogo argentino","braiton"));
        mascotas.add(new Mascota("gato", "femenino", "negro","corto","sin raza", "pelusa" ));
        mascotas.add(new Mascota("perro", "femenino", "marron","clargo","aleman", "lali" ));
        mascotas.add(new Mascota("ave", "masculino", "verde","corto","perico", "pirata" ));
        mascotas.add(new Mascota("roedor", "masculino", "gris","corto","cobayo", "stuart" ));
        int a=0;
        for (int i=0; i<mascotas.size(); i++){
           System.out.println(mascotas.get(i).getNombre()+" es un " + mascotas.get(i).getEspecie()+ " de pelaje " + mascotas.get(i).getPelaje());
           while (a<2){
               mascotas.get(i).setNombre("chichi");
               a++;
               mascotas.get(i+a).setNombre("pupee");
               a++;
           }    
        }
        System.out.println("----------------------------------------");
        for (Mascota masc: mascotas){
            System.out.println(masc.getNombre()+" es un " + masc.getEspecie()+ " de pelaje " + masc.getPelaje());
        }
                System.out.println("----------------------------------------");
        for (int i=0; i<mascotas.size(); i++){
            if(mascotas.get(i).getEspecie().equals("perro")){
            System.out.println(mascotas.get(i).getNombre());
            }
        }
    }
}
