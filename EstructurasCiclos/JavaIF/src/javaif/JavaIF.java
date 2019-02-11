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
        MayorEdad();
        // Hola Mundo
        Scanner Nom = new Scanner (System.in);
        System.out.println("Cual es tu Nombre ");
        String Nombre = Nom.nextLine();
        System.out.println("Hola " + Nombre + " como estas !");
        
        NumeroMayotyMenor();
    }
    
    public static void MayorEdad() {
        Scanner comienzo = new Scanner (System.in);
        System.out.print("Ingrese su edad: ");
        int edad = comienzo.nextInt();
        if (edad >= 18) 
            System.out.println("Ud. es mayor de Edad !");
        else 
            System.out.println("Ud. es menor de Edad !");
    }

    private static void NumeroMayotyMenor() {
        Scanner comienzo = new Scanner (System.in);
        System.out.println("\nEste Metodo sirve para hallar cual es el numero mayor");
        int num1, num2;
        System.out.println("Por Favor de digitar el primer Numero");
        num1 = comienzo.nextInt();
        System.out.println("Por Favor de digitar el segundo Numero");
        num2 = comienzo.nextInt();
        if (num1 > num2) 
            System.out.println("El Numero Mayor es: " + num1 + " !");
        else 
            System.out.println("El Numero Mayor es: " + num2 + " !");
    }
}
