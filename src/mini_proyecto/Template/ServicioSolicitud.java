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
public abstract class ServicioSolicitud {

    protected int cantidadMuestra;
    protected int precioServicio;
    protected int precioExtra;
    protected int precioConMaterialExtra;

    protected abstract void calcularPrecioExtra();

    public void calcularPrecioTotal() {
        this.calcularPrecioExtra();
        precioConMaterialExtra = precioServicio + precioExtra;
    }

    public int getCantidadMuestra() {
        return cantidadMuestra;
    }

    public int getPrecioSinMaterialExtra() {
        return precioServicio;
    }

    public int getPrecioExtra() {
        return precioExtra;
    }

    public int getPrecioConMaterialExtra() {
        return precioConMaterialExtra;
    }

    public void setCantidadMuestra(int cantidadMuestra) {
        this.cantidadMuestra = cantidadMuestra;
    }

    public void setPrecioSinMaterialExtra(int precioSinMaterialExtra) {
        this.precioServicio = precioSinMaterialExtra;
    }

    public void setPrecioExtra(int precioExtra) {
        this.precioExtra = precioExtra;
    }

    public void setPrecioConMaterialExtra(int precioConMaterialExtra) {
        this.precioConMaterialExtra = precioConMaterialExtra;
    }
    
//    public void visualizar(){
//         System.out.println("Cantidad Muestra :" + cantidadMuestra);
//        System.out.println("Precio del servicio: "+ precioServicio);
//        System.out.println("Precio total, incluye materiales a utilizar: "+ precioConMaterialExtra );
//    }
//    
}
