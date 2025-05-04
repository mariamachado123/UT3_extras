package Ej_2;

import java.util.ArrayList;

public interface IPila<T> {
    IPila<T> union(IPila<T> a);
    IPila<T> interseccion(IPila<T> a);
    ArrayList<T> getElementos();
    void apilar(T elemento);
    T desapilar();
    boolean estaVacia();
    void imprimir();
    int tamano();


}
