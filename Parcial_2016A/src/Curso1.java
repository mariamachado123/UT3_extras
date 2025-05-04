public class Curso1<T> {
    private ConjuntoDiferenciaSimetrica<T> listaDeClase;

    public Curso1() {
        this.listaDeClase = new ConjuntoDiferenciaSimetrica<>();
    }

    public ConjuntoDiferenciaSimetrica<T> getListaDeClase() {
        return listaDeClase;
    }

}
