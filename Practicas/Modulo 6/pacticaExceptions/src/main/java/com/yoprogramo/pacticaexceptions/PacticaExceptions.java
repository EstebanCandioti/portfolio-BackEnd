/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.yoprogramo.pacticaexceptions;

import java.util.Scanner;

/**
 *
 * @author esteban
 */
public class PacticaExceptions {

    public static void main(String[] args) throws Excepciones {
        
        //Practica 1
        /*
        try {
            int lista[]= {3,4,5,6};
            System.out.println("a: " + lista[4]);
        }
        catch (Exception e) {
            System.out.println("Error por desbordamiento");
        }*/
        
        //Practica 2
        /*
        Scanner teclado= new Scanner(System.in);
        int dividendo;
        int divisor;
        System.out.println("Ingrese el numero que quiere dividir");
        dividendo=teclado.nextInt();
        System.out.println("Ingrese el numero por el cual quiere dividir el dividendo");
        divisor=teclado.nextInt();
        try{
            double resultado=dividendo/divisor;
            System.out.println("El resultado de la division es: "+ resultado);
        }
        catch(ArithmeticException e){
            System.out.println("No se puede dividir estos numeros");
        }
        */
        
        //Practica 3
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad=teclado.nextInt();
        
        if (edad<100){
            System.out.println("a");
        }
        else{
            throw new Excepciones("edad no correcta");
        }        
    }
}
