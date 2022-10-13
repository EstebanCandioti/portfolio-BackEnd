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
public class practicaMatrices5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz [][]= new int [4][2],horasExtrasMes=0, horasExtrasTotales=0, horasJustasTrabajo=160;
        int vector[]= new int [4];
        Scanner teclado= new Scanner(System.in);

        for (int f=0; f<4; f++){
            for (int c=0; c<2; c++){
                System.out.println("Ingrese las horas del empleado "+f+" trabajadas en el mes " +c);
                int tecla= teclado.nextInt();
                matriz[f][c]=tecla;
                if(matriz[f][c]>horasJustasTrabajo){
                    horasExtrasMes=matriz[f][c]-horasJustasTrabajo;
                    horasExtrasTotales+=horasExtrasMes;
                    horasExtrasMes=0;
                }
                else{
                    horasExtrasTotales=horasExtrasMes;
                    horasExtrasMes=0;
                }
            }
            vector[f]=horasExtrasTotales;
            horasExtrasTotales=0;
        }
        for (int i=0; i<vector.length; i++){
            System.out.println("El empleado "+i+" trabajo "+vector[i]+ " horas extras");
        }
    }
    
}
