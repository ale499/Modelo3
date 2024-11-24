package org.example.entidades;

import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Articulo {
    private Long id;
    private String denominacion;
    private Double precioVenta;
    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Integer tiempoMinutos;
    private Imagenes imagen;
    private UnidadMedida unidadMedida;

    public static void mostrarMenu(List<Articulo> articulos){

        System.out.println("MENU:");
        // Mostrar cada artículo con su valor, denominación y unidad de medida
        for (Articulo articulo : articulos) {
            System.out.println("Denominación: " + articulo.getDenominacion());
            System.out.println("Valor: " + articulo.getPrecioVenta());
            System.out.println("Unidad de Medida: " + articulo.getUnidadMedida().getDenominacion());
            System.out.println("--------------------------------------------------");

        }

    }




}
