package com.salesianostriana.dam.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Profesor {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre, email;

    private LocalDate fechaIncorporacion;

    @OneToMany(mappedBy = "curso", fetch = FetchType.LAZY)
    private Set<Imparte> impartidos = new HashSet<>();

}
