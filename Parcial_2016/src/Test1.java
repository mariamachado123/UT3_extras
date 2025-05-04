import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Test1 {
    @Test
    public void testComplemento() {
        Alumno alumno=new Alumno(1,"Maria");
        Alumno alumno2=new Alumno(2,"Jose");
        Alumno alumno3=new Alumno(3,"Carlos");
        Alumno alumno4=new Alumno(4,"Juan");
        Alumno alumno5=new Alumno(5,"Vake");
        IConjunto<Alumno> conjuntoUniverso = new Conjunto_complemento<>();
        conjuntoUniverso.insertar(alumno);
        conjuntoUniverso.insertar(alumno2);
        conjuntoUniverso.insertar(alumno3);
        conjuntoUniverso.insertar(alumno4);
        conjuntoUniverso.insertar(alumno5);

        IConjunto<Alumno>conjunto = new Conjunto_complemento<>();
        conjunto.insertar(alumno);
        conjunto.insertar(alumno2);
        conjunto.insertar(alumno3);

        IConjunto<Alumno> complemento = conjuntoUniverso.complemento(conjunto);
        assertEquals(2,complemento.contador());
    }

}
