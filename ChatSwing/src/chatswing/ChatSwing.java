/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatswing;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 *
 * @author IngEspino
 */
public class ChatSwing extends JFrame {

    private JTextField tfNick;
    private JTextField tfMensaje;
    private JButton bLogin;
    private JButton bLogout;
    private JButton bEnviar;
    private JList lstLog;
    private Border border;

    public ChatSwing() {
        super("Chat");
        // pedimos el "panel de contencion" al JFrame
        Container content = getContentPane();

        // seteamos el layout
        content.setLayout(new BorderLayout());

        // este sera el tipo de borde que
        // utilizamos en todos los paneles
        border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        // creamos el panel norte
        JPanel pNorth = _crearPNorte();
        content.add(pNorth, BorderLayout.NORTH);

        // creamos el panel central
        JPanel pCenter = _crearPCenter();
        content.add(pCenter, BorderLayout.CENTER);
        // creamos el panel sur
        JPanel pSouth = _crearPSur();
        content.add(pSouth, BorderLayout.SOUTH);
        setSize(400, 300);
        setVisible(true);
    }

    private JPanel _crearPNorte() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        // instancio un TitledBorder con el titulo y ol objeto border
        // que cree en el constructor
        TitledBorder titleBoder
                = BorderFactory.createTitledBorder(border, "Nick");
        // asigno el titled border al panel
        p.setBorder(titleBoder);

        tfNick = new JTextField(10);
        p.add(tfNick);

        bLogin = new JButton("Login");
        p.add(bLogin);

        bLogout = new JButton("Logout");
        p.add(bLogout);

        return p;
    }

    private JPanel _crearPCenter() {
        JPanel p = new JPanel(new BorderLayout());
        TitledBorder titleBoder
                = BorderFactory.createTitledBorder(border, "Conversacion");
        p.setBorder(titleBoder);
        lstLog = new JList();
        JScrollPane scroll = new JScrollPane(lstLog);
        p.add(scroll, BorderLayout.CENTER);
        return p;
    }

    private JPanel _crearPSur() {
        JPanel p = new JPanel(new BorderLayout());
        TitledBorder titleBoder
                = BorderFactory.createTitledBorder(border, "Mensaje");
        p.setBorder(titleBoder);
        tfMensaje = new JTextField();
        p.add(tfMensaje, BorderLayout.CENTER);
        bEnviar = new JButton("Enviar");
        p.add(bEnviar, BorderLayout.EAST);

        return p;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ChatSwing c = new ChatSwing();
    }

}
