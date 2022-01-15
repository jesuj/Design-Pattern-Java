/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.State;

/**
 *
 * @author Karla Nogales
 */
public class PedidoContexto {

    private String Descripcion;
    private int Precio;
    private PedidoState estado;
    private boolean adelanto;

    public PedidoContexto() {
        
        this.setEstado(new Recibido());
    }
    
    public void adelantarPago(PedidoContexto p) {
        estado.adelantarPago(p);
    }

    public void cancelaPedido(PedidoContexto p) {
        estado.cancelaPedido(p);

    }

    public void CompletarPago(PedidoContexto p) {
        estado.CompletarPago(p);
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public int getPrecio() {
        return Precio;
    }

    public PedidoState getEstado() {
        return estado;
    }

    public boolean getAdelanto() {
        return adelanto;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public void setEstado(PedidoState estado) {
        this.estado = estado;
    }

    public void setAdelanto(boolean adelanto) {
        this.adelanto = adelanto;
    }
    
    
    
}
