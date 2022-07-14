/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //ejercio 1
        
        String nombre ;
        int num ;  // num enteros
        float num2; //numero decimal 32bit
        double num3; //numero decimal 64 bit
        char frase ; // caracter en comillas simples ''
//System.out.println("El resultado de la suma es: " + logico);
        
        
       // logico = num < 2;
       // System.out.println("El resultado de la suma es: " + logico);
        
        //Ejercicio 4
        
        String nombre1 = "German" ;
        int edad = 33;
        
        System.out.println("Mi nombre es: " +nombre1);
        System.out.println("Mi edad es: " +edad);
                
        
        //ejercio 5
        
        Scanner leer = new Scanner(System.in);
        
        //double
        System.out.println("Ingrese valor");  
        num3 = leer.nextDouble();
        
        System.out.println("El numer ingresado es " +num3);
        
        //logico
        
        System.out.println("Ingrese true o false ");
        
        boolean logico = leer.nextBoolean();
        
        System.out.println("el valor ingresado es " +logico);
        
        //char
        
        System.out.println("Ingrese un caracter ");
        
        frase = (char) System.in.read();
         System.out.println("el carcter es: " +frase);
               
    }
    
}
