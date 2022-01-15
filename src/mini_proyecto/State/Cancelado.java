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
public class Cancelado implements PedidoState {
     @Override
    public void adelantarPago(PedidoContexto p) {
         System.out.println("No se puede hacer nada, el pedido ya fue cancelado");
    }

    @Override
    public void cancelaPedido(PedidoContexto p) {
            System.out.println("el pedido ya se encuentra cancelado");
    }

    @Override
    public void CompletarPago(PedidoContexto p) {
        System.out.println("el pedido ya se encuentra cancelado, ya se devolvio el adelanto");
    }
}
