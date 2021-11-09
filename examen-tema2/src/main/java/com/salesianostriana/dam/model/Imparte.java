package com.salesianostriana.dam.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Imparte {

    @Builder.Default
    // Aquí falta una anotación
    private ImpartePK id = // Aquí falta código


    @JsonIgnoreProperties("impartidos")
    @ManyToOne(fetch = FetchType.LAZY)
    // Aquí falta código
    private Curso curso;

    @JsonIgnoreProperties("impartidos")
    @ManyToOne(fetch = FetchType.LAZY)
    // Aquí falta código
    private Profesor profesor;


    private String parte; // TEORÍA, PRÁCTICA

    private LocalDate fechaInicio, fechaFin;


    /* Aquí faltan dos métodos helpers */


    public void addToProfesor(Profesor p) {
        this.profesor = p;
        p.getImpartidos().add(this);
    }

    public void removeFromProfesor(Profesor p) {
        p.getImpartidos().remove(this);
        this.profesor = null;
    }




}
