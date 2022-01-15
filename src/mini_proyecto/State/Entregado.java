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
public class Entregado implements PedidoState{
     @Override
    public void adelantarPago(PedidoContexto p) {
         System.out.println("Ya se recibio el adelanto");
        
    }

    @Override
    public void cancelaPedido(PedidoContexto p) {
        System.out.println("El pedido ya fue entregado");
    }

    @Override
    public void CompletarPago(PedidoContexto p) {
        System.out.println("El pago fue completado ya se puede entregar el pedido");

    }
}
