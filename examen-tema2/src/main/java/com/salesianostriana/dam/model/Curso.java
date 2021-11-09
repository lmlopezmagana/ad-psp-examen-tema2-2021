package com.salesianostriana.dam.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NamedEntityGraph(
        name = "curso-imparte",
        attributeNodes = {
                @NamedAttributeNode(value = /* Aquí falta un valor */, subgraph = "subgrafo-profesor")
        },
        subgraphs = {
                @NamedSubgraph(name = "subgrafo-profesor", attributeNodes = {
                        @NamedAttributeNode(/* aquí falta un valor */)
                })

        }
)
@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Curso {

    @Id @GeneratedValue
    private Long id;

    private String nombre;

    private String categoria;

    private int numHoras;

    @OneToMany(mappedBy = "curso", fetch = FetchType.LAZY)
    private Set<Imparte> impartidos = new HashSet<>();



}
