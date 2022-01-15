/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import patrones.Composite.CompositeAreas;
import patrones.Composite.ServicioHoja;
import patrones.State.PedidoContexto;
import patrones.Template.ServicioSolicitud;
import patrones.Template.MuestraSangre;
import patrones.Template.MuestraOrina;

/**
 *
 * @author Karla Nogales
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // COMPOSITE
        CompositeAreas Pedido= new CompositeAreas("Pedido");
        CompositeAreas Analisi= new CompositeAreas("Analisis");
        CompositeAreas RayosX= new CompositeAreas("Rayos X");
        CompositeAreas Hematologia= new CompositeAreas("Hematologia");
        CompositeAreas Coagulograma= new CompositeAreas("Coagulograma");
        CompositeAreas Serologia= new CompositeAreas("Serologia");
        
     
        
        ////UTILIZANDO METODO TEMPLATE EN COMPOSITE
        ServicioSolicitud solicitudHemogramaSangre = new MuestraSangre();
        solicitudHemogramaSangre.setCantidadMuestra(2);
        solicitudHemogramaSangre.setPrecioSinMaterialExtra(50);
        //metodo template///
        solicitudHemogramaSangre.calcularPrecioTotal();
        
        
        ServicioHoja HemogramaCompleto= new ServicioHoja("Hemograma Completo", solicitudHemogramaSangre.getPrecioConMaterialExtra());
        

        ServicioHoja Reticulositos= new ServicioHoja("Reticulositos", 45);
        
        ServicioHoja FactorRh = new ServicioHoja("Factor RH", 60);
        
        ServicioHoja RecuentoPlaquetas = new ServicioHoja("Recuento de Plaquetas", 60);
        
        ServicioHoja Coagulacion = new ServicioHoja("Coagulacion", 35);
        
        ServicioHoja Chagas = new ServicioHoja("Chagas", 50);
        
        ServicioHoja Dengue = new ServicioHoja("Dengue", 50);
        
        ServicioHoja Radiografia= new ServicioHoja("Radiografia",70);
        
        Pedido.agregar(Analisi);
            Analisi.agregar(Hematologia);
                Hematologia.agregar(HemogramaCompleto);
                Hematologia.agregar(Reticulositos);
                Hematologia.agregar(FactorRh);
            Analisi.agregar(Coagulograma);
                Coagulograma.agregar(RecuentoPlaquetas);
                Coagulograma.agregar(Coagulacion);
            Analisi.agregar(Serologia);
                Serologia.agregar(Chagas);
                Serologia.agregar(Dengue);
                   
        Pedido.agregar(RayosX);
            RayosX.agregar(Radiografia);
               
        System.out.println("Precio de Hemograma de sangre mas el costo extra del material: "+solicitudHemogramaSangre.getPrecioConMaterialExtra()+"bs (TEMPLATE)");
        System.out.println("Precio total de todos los servicios solicitado: "+Pedido.getPrecio()+"bs (COMPOSITE)");
         
        
        /// PATRO STATE
        PedidoContexto pedido= new PedidoContexto();
        
        ///UTILIZANDO EL METODO getPrecio() DEL PATRON COMPOSITE (METODO RECURSIVO)
        pedido.setPrecio(Pedido.getPrecio());
        System.out.println("El precio del pedido es de: "+pedido.getPrecio()+ ("bs, se utiliza el resultado de composite para setear el precio del pedido en el patron STATE"));
        System.out.println("El pedido se encuentra Recibido por default");
        System.out.println("EL CLIENTE PAGA UN ADELANTO DEL PEDIDO");
        pedido.adelantarPago(pedido);
        System.out.println("......");
        System.out.println("EL CLIENTE SOLICITA LA CANCELACION DEL PEDIDO");
        pedido.cancelaPedido(pedido);
        System.out.println("......");
        System.out.println("EL CLIENTE COMPLETA EL PAGO DEL PEDIDO");
        pedido.CompletarPago(pedido);
        
        
    }

}
