/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaifanidado;

import java.util.*;

/**
 *
 * @author IngEspino
 */
public class JavaIFAnidado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner comienzo = new Scanner (System.in);
        System.out.println("Este programa sirve para hallar el indice de la masa corporal de una persona");
        double imc, peso, estatura;
        
        System.out.println("Por favor digite el peso de una Persona");
        peso = comienzo.nextDouble();
        
        System.out.println("Por favor digite la Estatura");
        estatura = comienzo.nextDouble();
        
        imc = peso / estatura;
        System.out.println("El IMC de una persona es: " + imc);
        
        if (imc < 16) {
            System.out.println("El peso del paciente es Muy Bajo");
        }else 
            if (imc == 16 || imc == 18.5) {
                System.out.println("El peso del paciente Bajo");
        }else
                if (imc == 18.6 || imc == 24.9) {
                    System.out.println("El peso del paciente es Normal");
        }else
                if (imc == 25 || imc == 29.9) {
                    System.out.println("El peso del paciente sufre de Sobre Peso");
        }else
                    if (imc > 30) {
                        System.out.println("El peso del paciente sufre de Obesidad");
        }
        
        PromedioAlumno();
        
    }

    private static void PromedioAlumno() {
        int N1, N2, N3;
        Scanner comienzo = new Scanner (System.in);
        System.out.println("Digite el Primer Numero");
        N1 = comienzo.nextInt();
        System.out.println("Digite el Segundo Numero");
        N2 = comienzo.nextInt();
        System.out.println("Digite el Tercer Numero");
        N3 = comienzo.nextInt();
        
        int Promedio =(N1+N2+N3)/3;
        
        if (Promedio>=10) {
            System.out.println("El Promedio es: " + Promedio);
            System.out.println("El Alumno Aprobado");
        }if (Promedio>=6) {
            System.out.println("El Promedio es: " + Promedio);
            System.out.println("El Alumno Aprobado");
        }if (Promedio<=5) {
            System.out.println("El Promedio es: " + Promedio);
            System.out.println("El Alumno Reprobado");
        }
    }
    
}
