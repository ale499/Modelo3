package org.example.entidades;

import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Cliente {

    private Long id;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String telefono;
    private String email;
    @Builder.Default
    private HashSet <Pedido> hace = new HashSet<>();

    public void mostrarPedido(Cliente clienteElegido,Integer pedidoElegido){

        System.out.println("pedido de: "+clienteElegido.getNombre()+" "+clienteElegido.getApellido());

        ArrayList<Pedido> pedidos = new ArrayList<>(clienteElegido.getHace());
        Pedido pedido = pedidos.get(pedidoElegido - 1);


        System.out.println("fecha: "+pedido.getFechaPedido());
        System.out.println("metodo de pago: "+pedido.getFormatoPago());
        System.out.println("envio : "+pedido.getTipoEnvio());

            for (DetallePedido detalle:pedido.getDetallePedidos()){
                System.out.println("articulo: "+detalle.getCantidad()+" "+detalle.getArticulo().getDenominacion());

            }
        System.out.println("total a pagar : "+pedido.getTotal());
        System.out.println("hora entrega esperada: "+pedido.getHoraFinalizacion());

    }

    public void pedidosCliente(Cliente clienteElegido){
        System.out.println("el cliente "+clienteElegido.getNombre()+" "+clienteElegido.getApellido());
        System.out.println("ha realizado "+clienteElegido.cantidadPedidos(clienteElegido)+" pedidos");
    }

    private Integer cantidadPedidos(Cliente clienteElegido){
        return hace.size();
    }


}
