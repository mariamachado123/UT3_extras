public class Parcial {
    public static void main(String[] args){
        Conjunto<TAlumno> conjunto = new Conjunto<>();
        conjunto.cargarDesdeBasicoEmp("Parcial_2019/src/basico-emp.txt");
        Conjunto<TAlumno> conjunto2 = new Conjunto<>();
        conjunto2.cargarDesdeIng("Parcial_2019/src/basico-ing.txt");
        IConjunto<TAlumno> union= conjunto.union(conjunto2);
        union.imprimir();
        IConjunto<TAlumno> interseccion= conjunto.interseccion(union);
        System.out.println("---");
        interseccion.imprimir();


    }
}
