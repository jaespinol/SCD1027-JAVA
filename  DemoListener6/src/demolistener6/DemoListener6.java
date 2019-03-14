/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demolistener6;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author IngEspino
 */
public class DemoListener6 extends Frame {

    private TextField tf;
    private Label lab;

    public DemoListener6() {
        super("Key Listener");

        // defino el layout principal
        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(new Label("Ingrese Texto:"));

        tf = new TextField(15);
        add(tf);
        lab = new Label();
        add(lab);

        // agrego los listeners al TextField
        tf.addKeyListener(new EscuchaTecla());
        tf.addActionListener(new EscuchaEnter());

        setSize(350, 100);
        setVisible(true);

        // mando el cursor al TextField
        tf.requestFocus();

        addWindowListener(new EscuchaVentana());
    }

    class EscuchaTecla implements KeyListener {

        @Override
        public void keyPressed(KeyEvent e) {
            // por cada tecla presionada tomo el caracter
            char c = e.getKeyChar();
            // seteo el caracter como texto del label
            lab.setText(Character.toString(c));
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }
    }

    class EscuchaEnter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // tomo el texto ingresado en el TextField
            String texto = tf.getText();
            // lo seteo como texto en el Label
            lab.setText(texto);
            // refresco los componentes de la ventana
            validate();

            // combierto a mayuscula el texto del TextField
            tf.setText(texto.toUpperCase());

            // lo selecciono todo
            tf.selectAll();
        }
    }

    class EscuchaVentana implements WindowListener {

        public void windowClosing(WindowEvent e) {
            // para cerrar la ventana y finalizar el programa
            // correctamente son tres pasos:
            // 1 – ocultar la ventana con setVisible(false)
            // 2 – liberarla con el metodo dispose
            // 3 – finalizar la aplicacion con System.exit
            System.out.println("oculto...");
            setVisible(false);

            System.out.println("Libero...");
            dispose();

            System.out.println("Bye bye...");
            System.exit(0);
        }
        // la interface WindowListener tiene 7 metodos asi que
        // tenemos que sobrescribirlos a todos aunque sea
        // dejandolos vacios

        public void windowActivated(WindowEvent e) {
        }

        public void windowClosed(WindowEvent e) {
        }

        public void windowDeactivated(WindowEvent e) {
        }

        public void windowDeiconified(WindowEvent e) {
        }

        public void windowIconified(WindowEvent e) {
        }

        public void windowOpened(WindowEvent e) {
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new DemoListener6();
       //new DemoJFrame();
    }

}
