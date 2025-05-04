import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestConjunto {

    @Test
    public void testDiferencia() {
        Alumno alumno=new Alumno(1,"Maria");
        Alumno alumno2=new Alumno(2,"Jose");
        Alumno alumno3=new Alumno(3,"Carlos");
        Alumno alumno4=new Alumno(4,"Juan");
        Alumno alumno5=new Alumno(5,"Vake");
        IConjunto<Alumno> conjunto1 = new ConjuntoDiferenciaSimetrica<>();
        conjunto1.insertar(alumno);
        conjunto1.insertar(alumno2);
        conjunto1.insertar(alumno3);
        conjunto1.insertar(alumno4);
        conjunto1.insertar(alumno5);

        IConjunto<Alumno> conjunto2 = new ConjuntoDiferenciaSimetrica<>();
        conjunto2.insertar(alumno);
        conjunto2.insertar(alumno2);
        conjunto2.insertar(alumno3);

        IConjunto<Alumno> diferencia= conjunto1.diferenciaSimetrica(conjunto2);
        assertEquals(2, diferencia.contador());



    }
}
