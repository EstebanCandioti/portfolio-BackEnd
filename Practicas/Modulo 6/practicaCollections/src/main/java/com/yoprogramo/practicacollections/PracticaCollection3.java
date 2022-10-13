/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.yoprogramo.practicacollections;

import java.util.Stack;

/**
 *
 * @author esteban
 */
public class PracticaCollection3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack <Autos> lista= new Stack<Autos>();
        
        lista.push(new Autos("aaa", "aaa", "aaa", "azul", "aaa"));
        lista.push(new Autos("bbb", "bbb", "bbb", "rojo", "bbb"));
        lista.push(new Autos("ccc", "ccc", "ccc", "verde", "ccc"));
        lista.push(new Autos("ddd", "ddd", "ddd", "rojo", "ddd"));
        lista.push(new Autos("eee", "eee", "eee", "gris", "eee"));
        lista.push(new Autos("fff", "fff", "fff", "rojo", "fff"));
        lista.push(new Autos("ggg", "ggg", "ggg", "blanco", "ggg"));
        
        int a=0;
        
        for (int i=0; i<lista.size(); i++){
            if(lista.get(i).getColor().equals("rojo")){
                if(a<1){
                    System.out.println(lista.get(i).getNumPatente()+lista.get(i).getModelo()+ lista.get(i).getMarca());
                    a=a+1;
                }
            }
        }
        
        System.out.println(lista.peek());
        System.out.println(lista.pop());
        
        lista.push(new Autos("hhh", "hhh", "hhh", "rosado", "hhh"));
        lista.push(new Autos("iii", "iii", "iii", "rojo", "iii"));
        
    }
    
}
