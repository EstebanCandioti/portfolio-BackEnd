/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author esteban
 */
public class practicaMatrices3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz [][]= new int [4][4];
        
        for (int f=0; f<4; f++){
            for (int c=0; c<4; c++){
                if(c==f){
                    matriz[f][c]=0;
                }
                else{
                    matriz[f][c]=1;
                }
            }
        }
        for (int f=0; f<4; f++){
            System.out.println(" "+matriz [f][0]+" "+matriz[f][1]+" "+matriz[f][2]+" "+matriz[f][3]);
        }
    }
    
}
