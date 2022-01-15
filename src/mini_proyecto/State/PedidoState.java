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
public interface PedidoState {
 
public void adelantarPago(PedidoContexto p);
 
 public void cancelaPedido(PedidoContexto p);
 
 public void CompletarPago(PedidoContexto p);
 
 
}
