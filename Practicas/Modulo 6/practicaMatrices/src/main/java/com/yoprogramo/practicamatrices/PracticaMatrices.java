/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.yoprogramo.practicamatrices;

import java.util.Scanner;

/**
 *
 * @author esteban
 */
public class PracticaMatrices {

    public static void main(String[] args) {
        double matriz[][]= new double [5][3];
        double vector [] = new double [5], 
        promedio=0,
        sumatoria=0;
        Scanner teclado= new Scanner(System.in);
        
        for (int f=0; f<5; f++){
            for(int c=0; c<3; c++){
                System.out.println("Ingrese la cantidad de goles del jugador: " +f+ " en el partido: "+c);
                double tecla= teclado.nextInt();
                matriz[f][c]=tecla;
                sumatoria=matriz[f][c];
            }
            promedio=sumatoria/3;
            vector[f]=promedio;     
        }
        for(int i=0; i<5; i++) {
            System.out.println("El promedio de goles del jugador: " +i+ " es de: "+vector[i]);
        }
    }
}
