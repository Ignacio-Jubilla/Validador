package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {
    @Test
    public void inscribirseAMaterias() {
        Materia aedd = new Materia("algoritmos");
        Materia am1 = new Materia("analisis mat 1");
        Materia pdp = new Materia("paradigmas de programacion", Set.of(aedd));
        Materia am2 = new Materia("analisis mat 2", Set.of(am1));
        Materia disenio = new Materia("disenio", Set.of(pdp));

        Alumno nacho = new Alumno("nachoJubi", new HashSet<>(Set.of(pdp, am1)));
        Alumno antiNacho = new Alumno("elNoNacho", new HashSet<>(Set.of(aedd)));

        Inscripcion insc = new Inscripcion(Set.of(disenio, am2), nacho);
        Inscripcion inscNt = new Inscripcion(Set.of(disenio, am2), antiNacho);

        Assertions.assertEquals(true, insc.aprobada());
        Assertions.assertEquals(false, inscNt.aprobada());
    }
}