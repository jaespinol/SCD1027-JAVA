/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacwhile;

import java.util.*;
/**
 *
 * @author IngEspino
 */
public class JavaCWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Num1_1000();
        NumPar();
    }

    private static void Num1_1000() {
        
        System.out.println("Este programa sirve para contar los numeros del a al 1000");
        int numero1 = 1;
        while(numero1 < 1000){
            numero1++;
            System.out.println("Numeros del 1 al 1000: " + numero1);
        }
    }
    
    private static void NumPar() {
        Scanner comienzo = new Scanner(System.in);
        int numero;
        System.out.println("Digite un numero par");
        numero= comienzo.nextInt();
        while (numero%2 == 0){
            System.out.println("Digite un numero");
            numero= comienzo.nextInt();
        }
        System.out.println("El numero No es par: " + numero);
    }
}
