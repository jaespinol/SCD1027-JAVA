/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacfor;
/**
 *
 * @author IngEspino
 */
public class JavaCFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Reloj();
        SumaNumeros();
        
    }

    private static void Reloj() {
        System.out.println("Este programa simula la hora de un reloj");
        for (int i = 0; i < 60; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 24; k++) {
                    System.out.println(" " +k+ ":" +j+ ":"+i );
                }
            }
        }
    }

    private static void SumaNumeros() {
        int suma=0;
        for (int i = 1; i <= 15; i++) {
            suma=suma+i;
            System.out.println("No.: "+i);
            System.out.println("Suma: " + suma );
        }
    }
    
}
