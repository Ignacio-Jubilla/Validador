package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;

import java.util.Set;

@Getter
@Setter
public class Materia {
    private String nombre;
    private Set<Materia> materiasCorrelativas;

    public Materia(String nombre, Set<Materia> materiasCorrelativas) {
        this.nombre = nombre;
        this.materiasCorrelativas = materiasCorrelativas;
    }

    public Materia(String nombre) {
        this(nombre, new HashSet<>());
    }

    public boolean correlativasAprobadas(Alumno alumno) {
        return materiasCorrelativas.stream().allMatch(mat -> alumno.getMateriasAprobadas().contains(mat));
    }
}
