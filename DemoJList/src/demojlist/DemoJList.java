/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojlist;

import java.awt.*;
import java.util.Vector;
import javax.swing.*;

/**
 *
 * @author IngEspino
 */
public class DemoJList extends JFrame {

    public DemoJList() {
        super("Demo JList");
        Container content = getContentPane();
        content.setLayout(new BorderLayout());
// obtengo el vector con los datos que vamos a mostrar
        Vector<Object> datos = _obtenerVectorDatos();
// El constructor de JList recibe una instancia de ListModel
        JList lista = new JList(new VectorModel(datos));
// El ScrollPane agrega barras de scroll si es necesario
        JScrollPane scrollLista = new JScrollPane(lista);
        content.add(scrollLista, BorderLayout.CENTER);
        setSize(300, 300);
        setVisible(true);
    }

    private Vector<Object> _obtenerVectorDatos() {
        Vector<Object> v = new Vector<Object>();
        v.add("John Lennon");
        v.add("Paul McCartney");
        v.add("George Harrison");
        v.add("Ringo Star");
        v.add("Sandro (Roberto Sanchez");
        v.add("Charly Garcia");
        v.add("Caetano Veloso");
        return v;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new DemoJList();
    }

}
