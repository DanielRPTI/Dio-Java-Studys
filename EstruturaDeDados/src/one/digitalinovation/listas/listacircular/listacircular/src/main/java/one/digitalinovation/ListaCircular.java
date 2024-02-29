package one.digitalinovation;

public class ListaCircular<T> {
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

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

    //Metodo Remove()
    /*
    * Primeiro verificamos se o index é maior que o tamanho da lista , se for ele lança uma exception
    * iniciamos o nosso noAuxiliar recebendo nossa cauda
    * após isso verificamos se o nosso index é == a 0 || 1 e realizamos a logica de ambas condições
    * caso seja um indice mais ao meio passamos por um laço for onde o seguimos a logica do index-1 ele pegara o index informado e subtraira
    * e irá começar em um nó antes do informado e assim ele percorre a cauda até o no a frente do removido
    */
    public void remove(int index){
        if(index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O indice é maior doque o tamanho da lista!");
        No<T> noAuxiliar = this.cauda;
        if(index == 0){
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(this.cauda);
        }else if (index == 1){
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        }else{
            for (int i = 0; i < index-1; i++){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        this.tamanhoLista--;
    }

    /*Metodo add()
    *  Iniciamos uma variavel do tipo Objeto No<T> , esse novoNo recebe o parametro conteudo
    * verificamos se o tamanho da lista é equivalente a 0 , se sim adicionamos o novoNo a cabeça
    * depois nossa cauda recebe o valor da nossa cabeca e por fim direcionamos o noProximo da cabeca para nossa cauda
    * se não for == 0 realizamos que o novoNo passar ser a nossa cauda pois ele é adicionado atrás da nossa cauda
    * o nosso antigo no cabeca apontara para sua nova cauda e a cauda ira receber nosso novoNo.
    */
    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (this.tamanhoLista == 0){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(this.cauda);
        }else {
            novoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }
    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    public int size(){
        return this.tamanhoLista;
    }


}
