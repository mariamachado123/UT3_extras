import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Corchetes {
    public static class Nodo {
        char valor;
        Nodo siguiente;

        public Nodo(char valor) {
            this.valor = valor;
        }
    }

    private Nodo cabeza;

    public boolean controlCorchetes(List<Character> entrada) {
        Stack<Character> pilaTemp = new Stack<>();
        if (entrada==null || entrada.isEmpty()) {
            System.out.println("Expresión vacía");
            return false;
        }
        cabeza=new Nodo(entrada.get(0));
        Nodo actual=cabeza;
        for (int i = 1; i < entrada.size(); i++) {
            actual.siguiente=new Nodo(entrada.get(i));
            actual=actual.siguiente;
        }
        actual=cabeza;
        if(actual.siguiente==null) {
            return false;
        }
        while(actual!=null) {
            if(actual.valor=='{') {
                try {
                    pilaTemp.push('{');
                    }catch (Exception e){
                    return false;
                }
            }else if(actual.valor=='}'){
                if(pilaTemp.isEmpty()) {
                    return false;
                }
                pilaTemp.pop();
            }actual=actual.siguiente;
        }return pilaTemp.isEmpty();
        }
    }

