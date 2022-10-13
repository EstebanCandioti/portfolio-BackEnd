/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.yoprogramo.practicamatrices;

import java.util.Scanner;

/**
 *
 * @author esteban
 */
public class practicaMatrices2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double matriz [][]= new double [10][4];
        Scanner teclado= new Scanner(System.in);
        double sumatoria=0.0;
        
        for(int f=0; f<10; f++){
            for(int c=0; c<3;c++){
                System.out.println("Ingrese la nota de la materia: " +c+ " del alumno: "+f);
                double tecla= teclado.nextDouble();
                matriz[f][c]=tecla;
                sumatoria=sumatoria+matriz[f][c];
            }
            matriz[f][3]=sumatoria/3;
            sumatoria=0.0;
        }
        for(int f=0; f<10; f++){
            for(int c=0; c<4;c++){
                if(c<3){
                    System.out.println("Las notas del alumno: "+f+" son: "+ matriz[f][c]);
                }
                else{
                    System.out.println("El promedio del alumno: "+f+" es: "+ matriz[f][c]);
                }
            }
        }
    } 
}
