package com.salesianostriana.dam.repos;

import com.salesianostriana.dam.dto.GetCursoDto;
import com.salesianostriana.dam.model.Curso;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CursoRepository extends JpaRepository<Curso, Long> {

    // Aquí falta una anotación que no es @Query
    public Optional<Curso> findById(Long id);

    @Query(value = """
            select new com.salesianostriana.dam.dto.GetCursoDto(
                /* aquí faltan varios argumentos */, (
                    select max(i.id.edicion) 
                    from Imparte i
                    where i.id.curso_id = c.id
                )
            )
            from Curso c
            """,
    countQuery = """
            select count(*) from Curso c
            """)
    public Page<GetCursoDto> listadoCursos(/* Aquí falta un argumento */);

    // Aquí falta una anotación que no es @Query
    public List<Curso> /* Aquí falta una consulta derivada por nombre del método */(String categoria);

}
