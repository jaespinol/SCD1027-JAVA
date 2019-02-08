/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaif;
import java.util.Scanner;

/**
 *
 * @author IngEspino
 */
public class JavaIF {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner comienzo = new Scanner (System.in);
        Scanner Nom = new Scanner (System.in);
         System.out.print("Ingrese su edad: ");
         int edad = comienzo.nextInt();
        if (edad >= 18) 
            System.out.println("Ud. es mayor de Edad !");
        else 
            System.out.println("Ud. es menor de Edad !");
        // Hola Mundo
        System.out.println("Cual es tu Nombre ");
         String Nombre = Nom.nextLine();
         System.out.println("Hola " + Nombre);
    }
}
