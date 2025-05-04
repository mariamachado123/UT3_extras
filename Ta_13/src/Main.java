import Ej_1.Cola;
import Ej_1.TAlumno;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TAlumno alumno1 = new TAlumno(1234, "Luca", "Perez");
        TAlumno alumno2 = new TAlumno(4567, "Maria", "Pedro");
        TAlumno alumno3 = new TAlumno(7890, "Jose", "Gomez");
        TAlumno alumno4 = new TAlumno(1122, "Ana", "Martínez");
        TAlumno alumno5 = new TAlumno(3344, "Pedro", "Fernández");

        Cola colaProg2 = new Cola();
        Cola colaAYEDD = new Cola();
        colaProg2.encolar(alumno1);
        colaProg2.encolar(alumno2);
        colaProg2.encolar(alumno3);

        colaAYEDD.encolar(alumno3);
        colaAYEDD.encolar(alumno4);
        colaAYEDD.encolar(alumno5);

        Cola union=(Cola)colaProg2.union(colaAYEDD);
        System.out.println("UNION DE AMBAS: ");
        union.imprimir();

        Cola interseccion=(Cola)colaProg2.interseccion(colaAYEDD);
        System.out.println("INTERSECCION DE AMBAS: ");
        interseccion.imprimir();
    }
}