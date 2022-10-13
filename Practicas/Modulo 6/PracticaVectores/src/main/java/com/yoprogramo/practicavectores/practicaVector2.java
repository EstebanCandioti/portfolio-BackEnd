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
public class practicaVector2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vector [] = new int [15], edadMenor=100, edadMayor=1;
        Scanner teclado = new Scanner (System.in);
        for (int i=0; i<vector.length; i++){
          System.out.println("Ingrese la edad del alumno :"+ i );
          int tecla= teclado.nextInt();
          vector[i]=tecla;
        }
        for (int i=0; i<vector.length; i++){
            if (vector[i]<edadMenor){
                edadMenor= vector[i];
            }
            if (vector[i]>edadMayor){
                edadMayor=vector[i];
            }
        }
        System.out.println("La edad menor es: " + edadMenor);
        System.out.println("La edad mayor es: " + edadMayor);
    }
    
}
