package org.example.entidades;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Imagenes {
    private Long id;
    private String nombre;
    private String url;
}
