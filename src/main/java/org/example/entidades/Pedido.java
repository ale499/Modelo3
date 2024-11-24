package org.example.entidades;

import lombok.*;

import java.awt.dnd.DropTarget;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Pedido {
    private Long id;
    private LocalTime horaFinalizacion;
    private Double total;
    private Double costoTotal;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormatoPago formatoPago;
    private LocalDate fechaPedido;
    private HashSet<DetallePedido> detallePedidos;

    public Double sacarPrecioTotal(HashSet<DetallePedido> detallePedidos) {
        Double precioTotal = 0.0;
        for(DetallePedido detalle:detallePedidos){
            precioTotal += detalle.getArticulo().getPrecioVenta();
        };
        return precioTotal;
    };
    public Double sacarCostoTotal(HashSet<DetallePedido> detallePedidos) {
        Double costoTotal = 0.0;
        for(DetallePedido detalle:detallePedidos){
            costoTotal += detalle.getArticulo().getPrecioVenta();
        }
        return costoTotal;
    }

}
