public class TAlumno {
    private String nombre;
    private int id;

    public TAlumno(int id, String nombre) {
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
