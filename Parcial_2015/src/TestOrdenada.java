import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestOrdenada {

    @Test
    public void testOrdenada() {
        ListaOrdenada<Integer> listaOrdenada = new ListaOrdenada();
        listaOrdenada.insertar(1);
        listaOrdenada.insertar(2);
        listaOrdenada.insertar(3);
        listaOrdenada.insertar(4);

        ListaOrdenada<Integer> listaOrdenadaAux = new ListaOrdenada();
        listaOrdenadaAux.insertar(5);
        listaOrdenadaAux.insertar(6);
        listaOrdenadaAux.insertar(7);
        listaOrdenadaAux.insertar(8);

        ListaOrdenada<Integer> resultado= (ListaOrdenada<Integer>) listaOrdenadaAux.mezclarCon(listaOrdenada);
        assertTrue(listaOrdenadaAux.estaVacia());
        assertTrue(listaOrdenada.estaVacia());

        assertTrue(resultado.contiene(1));
        assertTrue(resultado.contiene(2));
        assertTrue(resultado.contiene(3));
        assertTrue(resultado.contiene(4));
        assertTrue(resultado.contiene(5));
        assertTrue(resultado.contiene(6));
        assertTrue(resultado.contiene(7));
        assertTrue(resultado.contiene(8));

    }

    @Test
    public void eliminarDuplicados(){
        ListaOrdenada<Integer> listaOrdenada = new ListaOrdenada();
        listaOrdenada.insertar(1);
        listaOrdenada.insertar(2);
        listaOrdenada.insertar(3);
        listaOrdenada.insertar(4);

        ListaOrdenada<Integer> listaOrdenadaAux = new ListaOrdenada();
        listaOrdenadaAux.insertar(4);
        listaOrdenadaAux.insertar(5);
        listaOrdenadaAux.insertar(6);
        listaOrdenadaAux.insertar(7);
        listaOrdenadaAux.insertar(8);

        ListaOrdenada<Integer> resultado= (ListaOrdenada<Integer>) listaOrdenadaAux.eliminarDuplicados(listaOrdenada);
        assertTrue(listaOrdenadaAux.estaVacia());
        assertTrue(listaOrdenada.estaVacia());
        assertTrue(resultado.contiene(1));
        assertTrue(resultado.contiene(2));
        assertTrue(resultado.contiene(3));
        assertTrue(resultado.contiene(4));
        assertTrue(resultado.contiene(5));
        assertTrue(resultado.contiene(6));
        assertTrue(resultado.contiene(7));
        assertTrue(resultado.contiene(8));
        assertEquals(8,resultado.tamano());


    }

}
