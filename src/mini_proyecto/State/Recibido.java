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
public class Recibido implements PedidoState{
     @Override
    public void adelantarPago(PedidoContexto p) {
         System.out.println("Se registro el adelanto, el pedido ahora se encuentra en proceso");
         p.setAdelanto(true);
         p.setEstado(new EnProceso());
    }

    @Override
    public void cancelaPedido(PedidoContexto p) {
        System.out.println("Se procede a cancelar la solicitud del pedido");
        p.setDescripcion("Pedido Cancelado");
        p.setEstado(new Cancelado());
        
    }
    @Override
    public void CompletarPago(PedidoContexto p) {
        System.out.println("El pedido tiene que encontrarse en proceso");
    }
}
