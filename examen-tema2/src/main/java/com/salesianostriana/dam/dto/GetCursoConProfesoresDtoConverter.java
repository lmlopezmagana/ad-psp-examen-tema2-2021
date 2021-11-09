package com.salesianostriana.dam.dto;

import com.salesianostriana.dam.model.Curso;
import com.salesianostriana.dam.model.Imparte;
import com.salesianostriana.dam.model.Profesor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class GetCursoConProfesoresDtoConverter {

    public GetCursoConProfesoresDto convertCursoToGetCursoConProfesoresDtoConverter(Curso c) {

        return GetCursoConProfesoresDto.builder()
                // Aquí faltan 3 líneas de código
                .profesores(
                        c.getImpartidos()
                                .stream()
                                .map(Imparte::getProfesor)
                                .map(Profesor::getNombre)
                                .distinct()
                                .collect(Collectors.joining(", "))
                )
                // Aquí falta una línea de código

    }

}
