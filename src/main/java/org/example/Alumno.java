package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;
@Getter
@Setter
public class Alumno {
    private String nombre;
    private Set<Materia> materiasAprobadas;

    public Alumno(String nombre, Set<Materia> materiasAprobadas) {
        this.nombre = nombre;
        this.materiasAprobadas = materiasAprobadas;
    }

    public void aprobarMateria(Materia materia) {
        materiasAprobadas.add(materia);
    }
}

