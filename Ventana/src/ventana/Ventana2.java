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
public class Ventana2 extends Frame {

    private Button bNorth, bSouth, bWest, bEast, bCenter;

    public Ventana2() {
        super("Esta es la Ventana 2");
        setLayout(new BorderLayout());
        bNorth = new Button("Norte");
        add(bNorth, BorderLayout.NORTH);
        bSouth = new Button("Sur");
        add(bSouth, BorderLayout.SOUTH);
        bWest = new Button("Oeste");
        add(bWest, BorderLayout.WEST);
        bEast = new Button("Este");
        add(bEast, BorderLayout.EAST);
        bCenter = new Button("Centro");
        add(bCenter, BorderLayout.CENTER);
        setSize(300, 300);
        setVisible(true);
    }
}
