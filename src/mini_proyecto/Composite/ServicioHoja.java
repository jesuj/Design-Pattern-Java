/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.Composite;

/**
 *
 * @author Karla Nogales
 */
public class ServicioHoja implements Component_I {

    private String Nombre;
    private int Precio;
    // private int cantidadMuestra;

    public ServicioHoja() {

    }

    public ServicioHoja(String Nombre, int Precio) {
        this.Nombre = Nombre;
        this.Precio = Precio;
        //this.cantidadMuestra = cantidadMuestra;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    @Override
    public int getPrecio() {
        return this.Precio;
    }

}
