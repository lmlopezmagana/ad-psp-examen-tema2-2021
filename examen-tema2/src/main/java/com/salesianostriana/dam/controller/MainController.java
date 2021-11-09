package com.salesianostriana.dam.controller;

import com.salesianostriana.dam.dto.GetCursoConProfesoresDto;
import com.salesianostriana.dam.dto.GetCursoConProfesoresDtoConverter;
import com.salesianostriana.dam.dto.GetCursoDto;
import com.salesianostriana.dam.model.Curso;
import com.salesianostriana.dam.repos.CursoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final CursoRepository cursoRepository;
    private final GetCursoConProfesoresDtoConverter converter;


    /**
     * Esta petición devuelve una página de resultados con instancias de GetCursoDto
     * @param  Información de paginación
     * @return Una página de resultados de tipo GetCursoDto
     */
    @GetMapping("/curso/")
    public ResponseEntity<Page<GetCursoDto>> todosLosCursos(
            // Aquí falta una anotación y un argumento
            ) {

        Page<GetCursoDto> result = cursoRepository.listadoCursos(/* aquí falta un argumento*/ );

        return result.isEmpty() ?
                ResponseEntity.notFound().build() :
                ResponseEntity.ok(result);
    }

    /**
     * Este método devuelve una lista de GetCursoConProfesoresDto para aquellos
     * cursos que cuya categoría contiene (total o parcialmente) el argumento proporcionado
     * @param Cadena de búsqueda
     * @return Lista de resultados (sin paginar)
     */
    @GetMapping("/curso/categoria/{categoria}")
    public ResponseEntity<List<GetCursoConProfesoresDto>> cursosDeUnaCategoria(/* Aquí falta un argumento */) {
        List<Curso> result = cursoRepository.// aquí falta la llamada a un método pasando un argumento

        return result.isEmpty() ?
                ResponseEntity.notFound().build() :
                ResponseEntity.ok(
                        result.stream()
                                .map(converter::convertCursoToGetCursoConProfesoresDtoConverter)
                                .collect(Collectors.toList()));
    }

    /**
     * Este método busca un Curso por su ID
     * @param id Identificador del curso
     * @return Curso encontrado, 404 si no lo encuentra.
     */
    @GetMapping("/curso/{id}")
    public ResponseEntity<Curso> unCurso(@PathVariable Long id) {
        // Aquí falta una, y solo una, línea de código
    }



}
