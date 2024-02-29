package one.digitalinovation;

public class ListaCircular<T> {
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    /*
    * Neste get no de lista circular verificamos primeiramente se nossa lista está vazia
    * depois verificamos se nosso index informado é 0 se for ele retorna o no da cauda
    * após isso se passarmos das verificações iniciamos nosso for com nosso noAuxiliar para percorrer a lista
    */
    private No<T> getNo(int index){
        if(this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia!");
        if(index == 0){
            return this.cauda;
        }
        No<T> noAuxiliar = this.cauda;
        for(int i = 0;  (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }
    //Em nosso metodo get é simples , apenas utilizamos nosso generic e retornamos nosso getNo com o index desejado que é retornado em nosso getConteudo
    public T get(int index){
        return this.getNo(index).getConteudo();
    }




    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    public int size(){
        return this.tamanhoLista;
    }


}
