public class Alumno {
    private String nombre;
    private int id;

    public Alumno(int id, String nombre) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return nombre + " (" + id + ")";
    }
}
