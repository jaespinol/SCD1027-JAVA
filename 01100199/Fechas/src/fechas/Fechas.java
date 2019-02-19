/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

/**
 *
 * @author IngEspino
 */
public class Fechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fecha f = new Fecha();
        //f.dia = 2; // la variable dia es privada, no tenemos acceso
        //f.mes = 10; // idem...
        //f.anio = 1970; // olvidalo...

        f.setDia(5);
        f.setMes(10);
        f.setAnio(1970);
// imprimo el dia
        System.out.println("Dia=" + f.getDia());
// imprimo el mes
        System.out.println("Mes=" + f.getMes());
// imprimo el anio
        System.out.println("Anio=" + f.getAnio());
// imprimo la fecha
        System.out.println(f);
        FechaDetallada f1=new FechaDetallada();      
        f1.setDia(25);      
        f1.setMes(02);      
        f1.setAnio(2009);        
        System.out.println(f1);
        
        FechaDetallada f2=new FechaDetallada(18,05,2019); 
        System.out.println(f2);
    }

}
