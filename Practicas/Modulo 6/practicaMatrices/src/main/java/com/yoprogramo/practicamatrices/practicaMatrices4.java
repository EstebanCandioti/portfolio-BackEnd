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
public class practicaMatrices4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String matriz [][]= new String [5][5];
        String plato;
        String cheker, si= "si";
        Scanner teclado= new Scanner(System.in), sc= new Scanner(System.in);
        
        for (int f=0; f<5; f++){
            for (int c=0; c<5; c++){
                if(c==0){
                    System.out.println("Ingrese el plato "+f+ " del menu");
                    String menu= teclado.nextLine();
                    matriz[f][c]=menu;
                }
                else{
                    System.out.println("El menu: "+matriz[f][0]+" tiene acompaniamiento?");
                    cheker=sc.next();
                    if(si.equals(cheker)){
                        System.out.println("Ingrese el acompaniamiento");
                        String acompaniemiento=teclado.nextLine();
                        matriz[f][c]=acompaniemiento;
                    } 
                    else {                       
                            matriz[f][c]="Ninguno";
                    }
                }
            }
        }
        
        System.out.println("Ingrese el plato que quiere buscar");
        plato=teclado.next();
        for (int f=0; f<5; f++){
            for (int c=0; c<5; c++){
                if (matriz[f][c].equals(plato)){
                    System.out.println("El plato "+matriz[f][c]+ "tiene de acompaniamiento "+ matriz[f][1]+ ", "+ matriz[f][2]+
                    ", "+ matriz[f][3]+ ", "+ matriz[f][4]);
                }
            }
        }
        
    }

         
}