package com.salesianostriana.dam.dto;

import lombok.*;

@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
public class GetCursoDto {

    private Long id;
    private String nombre;
    private String categoria;
    private int numHoras;
    private int numEdiciones;

}
