/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.yoprogramo.practicavectores;

import java.util.Scanner;

/**
 *
 * @author esteban
 */
public class practicaVector3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] dnis = new int [5];
        // TODO code application logic here
        String[] nombres = new String [5];
        // TODO code application logic here
        String[] apellidos = new String [5];
        
        Scanner teclado = new Scanner (System.in);
        for (int i=0; i<dnis.length; i++){
            
          System.out.println("Ingrese el dni del cleinte :"+ i );
          
          int tecla= teclado.nextInt();
          
          dnis[i]=tecla;
          
          System.out.println("Ingrese el nombre del cleinte :"+ i );
          
          String teclas= teclado.next();
          
          nombres[i]=teclas;
          
          System.out.println("Ingrese el apellido  del cleinte :"+ i );
          
          teclas= teclado.next();
          
          apellidos[i]=teclas;
        }
        
        for (int i=0; i<dnis.length; i++){
            System.out.println("El dni :" + dnis[i] + " corresponde al cliente " + nombres[i] + apellidos [i]);
        }
    }
}
