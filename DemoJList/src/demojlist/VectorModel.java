/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojlist;

import java.util.Vector;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author IngEspino
 */
public class VectorModel implements ListModel {

    private Vector<Object> datos;

    public VectorModel(Vector<Object> datos) {
        this.datos = datos;
    }

    public Object getElementAt(int index) {
        return datos.get(index);
    }

    public int getSize() {
        return datos.size();
    }

    public void removeListDataListener(ListDataListener lst) {
    }

    public void addListDataListener(ListDataListener lst) {
    }
}
