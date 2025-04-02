package org.example;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
public class Inscripcion {
    private Set<Materia> listaMaterias;
    private Alumno alumno;

    public Inscripcion(Set<Materia> listaMaterias, Alumno alumno) {
        this.listaMaterias = listaMaterias;
        this.alumno = alumno;
    }

    public boolean aprobada() {
        return listaMaterias.stream().allMatch(materia -> materia.correlativasAprobadas(alumno));
    }
}
