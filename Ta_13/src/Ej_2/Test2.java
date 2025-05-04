package Ej_2;

import Ej_1.TAlumno;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test2 {
    @Test
    public void testPila(){
        TAlumno alumno1 = new TAlumno(1234, "Luca", "Perez");
        TAlumno alumno2 = new TAlumno(4567, "Maria", "Pedro");
        TAlumno alumno3 = new TAlumno(7890, "Jose", "Gomez");
        TAlumno alumno4 = new TAlumno(1122, "Ana", "Martínez");
        TAlumno alumno5 = new TAlumno(3344, "Pedro", "Fernández");

        Pila pilaProg = new Pila();
        Pila pilaAYEDD = new Pila();

        pilaProg.apilar(alumno1);
        pilaProg.apilar(alumno2);
        pilaProg.apilar(alumno3);

        pilaAYEDD.apilar(alumno3);
        pilaAYEDD.apilar(alumno4);
        pilaAYEDD.apilar(alumno4);
        pilaAYEDD.apilar(alumno5);

        Pila union = new Pila();
        union=(Pila) pilaProg.union(pilaAYEDD);
        System.out.println("UNION: ");
        union.imprimir();
        assertEquals(5,union.tamano());

        Pila intersection = new Pila();
        intersection=(Pila) pilaProg.interseccion(pilaAYEDD);
        System.out.println("INTERSECTION: ");
        intersection.imprimir();
        assertEquals(1,intersection.tamano());
    }
}
