/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.Composite;

import java.util.ArrayList;

/**
 *
 * @author Karla Nogales
 */
public class CompositeAreas implements Component_I {

    private ArrayList<Component_I> ListaCompuesto = new ArrayList<>();
    private String nombre;

    public CompositeAreas() {

    }

    public CompositeAreas(String nombre) {
        this.nombre = nombre;
    }
 
    @Override
    public int getPrecio() {
        int s = 0;
        for (int i = 0; i < ListaCompuesto.size(); i++) {
            s = s + ListaCompuesto.get(i).getPrecio();

        }
        return s;
    }
    
    public void agregar(Component_I c){
        ListaCompuesto.add(c);
    }

    public ArrayList<Component_I> getListaCompuesto() {
        return ListaCompuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setListaCompuesto(ArrayList<Component_I> ListaCompuesto) {
        this.ListaCompuesto = ListaCompuesto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

}
