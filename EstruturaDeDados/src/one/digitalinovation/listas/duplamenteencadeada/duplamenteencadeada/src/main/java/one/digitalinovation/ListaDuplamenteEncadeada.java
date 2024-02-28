package one.digitalinovation;

public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista = 0;

    public ListaDuplamenteEncadeada (){
        primeiroNo = null;
        ultimoNo = null;
        this.tamanhoLista = 0;
    }


    public int size(){
        return tamanhoLista;
    }
}
