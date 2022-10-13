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
public class practivaVectores5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String animales[]= new String [10], 
        inverso[]= new String [10];
        Scanner teclado= new Scanner(System.in);
        
        for (int i=0; i<animales.length; i++){
                System.out.println("Ingrese el tipo de animales numero: " + i);
                String tecla= teclado.next();
                animales[i]=tecla;
    }
        int a=0;
        for(int i=animales.length-1; i>=0; i--){

            inverso[a]= animales[i];
            a=a+1;
        }   
        for (int i=0; i<animales.length;i++){
            System.out.println("El animal numero: "+ i+" es: " +animales[i]);
            System.out.println("El animal inverso numero: "+ i+" es: " +inverso[i]);
        }
}
}
