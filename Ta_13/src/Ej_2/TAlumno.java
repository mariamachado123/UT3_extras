package Ej_2;

public class TAlumno {
    int cedula;
    String nombre;
    String apellido;
    public TAlumno(int cedula, String nombre, String apellido) {
        if(String.valueOf(cedula).length() != 4){
            throw new IllegalArgumentException("La cedula no es correcta");
        }
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Comparar la misma instancia
        if (obj == null) return false; // Verificar si es nulo
        if (getClass() != obj.getClass()) return false; // Verificar si son de la misma clase

        TAlumno alumno = (TAlumno) obj; // Convertir el objeto a tipo TAlumno
        return cedula == alumno.cedula; // Comparar solo por la cédula
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(cedula);
    }

    @Override
    public String toString() {
        return "TAlumno{" + "cedula=" + cedula + ", nombre='" + nombre + '\'' + ", apellido='" + apellido + '\'' + '}';
    }
}
