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
public class practicaVector4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int temperaturas []= new int [23], 
        top []= new int [5], 
        temp1=0, 
        temp2=0,
        temp3=0,
        temp4=0,
        temp5=0;
        Scanner teclado = new Scanner (System.in);
         
            for (int i=0; i<temperaturas.length; i++){
            
            System.out.println("Ingrese la temperatura de la provincia: " + i);
            
            int tecla=teclado.nextInt();
            
            temperaturas[i]=tecla;
            if (temperaturas[i]>temp1){
                temp5=temp4;
                temp4=temp3;
                temp3=temp2;
                temp2=temp1;
                temp1=temperaturas[i];
            }
        }
        top[0]=temp1;
        top[1]=temp2;
        top[2]=temp3;
        top[3]=temp4;
        top[4]=temp5;
        for (int i=0; i<top.length; i++){
            System.out.println("las maximas temperaturas son:" + top[i]);
        }
        
    

        
    }
}
        