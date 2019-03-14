/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;
import java.awt.*;

/**
 *
 * @author IngEspino
 */
public class Ventana extends Frame {

    /**
     * @param args the command line arguments
     */
    private Button b1,b2,b3;
    
    public Ventana(){
        // el constructor del padre recibe el titulo de la ventana
        super("Esta es la Ventana 1");
        // defi no el layout que va a tener la ventana: FlowLayout
        //setLayout(new FlowLayout());
        setLayout(new FlowLayout(FlowLayout.LEFT));
        // instancio el primer boton y lo agrego al container
        b1 = new Button("Boton 1");
        add(b1);
        // instancio el segundo boton y lo agrego al container
        b2 = new Button("Boton 2");
        add(b2);
        // instancio el tercer boton y lo agrego al container
        b3 = new Button("Boton 3");
        add(b3);
        // defi no el size de la ventana y la hago visible
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Ventana v1 = new Ventana();
       
        Ventana2 v2 = new Ventana2();
    }
    
}
