package com.salesianostriana.dam.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetCursoConProfesoresDto {

    private Long id;
    private String nombre;
    private int numHoras;
    private String profesores; // Lista separada por coma de los nombres


}
