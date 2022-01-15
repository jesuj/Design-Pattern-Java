/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.Template;

/**
 *
 * @author Karla Nogales
 */
public class MuestraSangre extends ServicioSolicitud {
    protected void calcularPrecioExtra(){
        precioExtra= cantidadMuestra*5;
    }
}
