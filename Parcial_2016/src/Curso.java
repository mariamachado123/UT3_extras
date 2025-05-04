public class Curso<T> {
     private Conjunto_complemento<T> listaDeClase;

    public Curso() {
        this.listaDeClase = new Conjunto_complemento<>();
    }

    public Conjunto_complemento<T> getListaDeClase() {
        return listaDeClase;
    }

    public IConjunto<T> noInscriptos(IConjunto<T> conjunto) {
        return conjunto.complemento(listaDeClase);
    }


}
