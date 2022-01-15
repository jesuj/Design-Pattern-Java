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
public class EnProceso implements PedidoState {

   
    @Override
    public void adelantarPago(PedidoContexto p) {
        System.out.println("El pedido ya se encuentra EN PROCESO ya tiene adelanto pagado");        
    }

    @Override
    public void cancelaPedido(PedidoContexto p) {
        System.out.println("Se devolvera adelanto, el pedido se encuentra en estado CANCELADO");
        p.setAdelanto(false);
        p.setEstado(new Cancelado());
    }

    @Override
    public void CompletarPago(PedidoContexto p) {
        System.out.println("Se completo el pago ya se puede entregar el pedido");
        p.setEstado(new Entregado());
    }

}
