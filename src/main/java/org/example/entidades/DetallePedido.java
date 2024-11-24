package org.example.entidades;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class DetallePedido {
    private Long id;
    private Integer cantidad;
    private Double subTotal;
    private Articulo articulo;
}
