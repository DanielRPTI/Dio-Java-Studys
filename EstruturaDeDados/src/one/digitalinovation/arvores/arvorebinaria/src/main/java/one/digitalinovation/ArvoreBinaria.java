package one.digitalinovation;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo) {
        BinNo<T> novoNo = new BinNo<>(conteudo);
        this.raiz = inserir(raiz, novoNo);
    }

    /*Inserir private
     * aqui recebemos o nosso no atual e nosso novoNo para realizar a inserção
     * iniciamos verificando se a raiz informada no inserir publico é igual a null , se for ele irá iniciar nossa raiz com o valor do novoNo
     * Se nao se o novoNo for menor que o conteudo do no atual que é nossa raiz , setamos o novoNo a esquerda no Noautal , chamando o metodo inserir
     * por fim se o novoNo for maior que o no atual ele é setado ao no da direita.
     */
    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {
        if (atual == null) {
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        } else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }

    //Metodo In Orderm verifica o os nos antes de mostralos , primeiramente a esquerda depois a direita
    public void exibirInOrdem() {
        System.out.println("\n Exibindo InOrdem");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirInOrdem(atual.getNoEsq());
            System.out.println(atual.getConteudo() + ", ");
            exibirInOrdem(atual.getNoDir());
            System.out.println(atual.getConteudo() + ", ");
        }
    }

    //Metodo PosOrdem visita primeiro os Nos e mostra depois o conteudo
    public void exibirPosOrdem() {
        System.out.println("\n Exibindo PosOrdem");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirInOrdem(atual.getNoEsq());
            exibirInOrdem(atual.getNoDir());
            System.out.println(atual.getConteudo() + ", ");
        }
    }

    //Metodo Pre Ordem ele mostra o conteudo antes de visitar os Nos
    public void exibirPreOrdem() {
        System.out.println("\n Exibindo PreOrdem");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(BinNo<T> atual) {
        if (atual != null) {
            System.out.println(atual.getConteudo() + ", ");
            exibirInOrdem(atual.getNoEsq());
            exibirInOrdem(atual.getNoDir());
        }
    }

    //Metodo Remove()
    public void remove(T conteudo) {
        try {
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;
            //laço while que é realizado se a raiz for diferente  e se o conteudo da raiz não for igual ao conteudo passado.
            while (atual != null && !atual.getConteudo().equals(conteudo)) {
                pai = atual;
                //Verificamos se o nosso conteudo passado é maior que nossa raiz , se for ela irá procurar pelos lados da arvore
                if (conteudo.compareTo(atual.getConteudo()) < 0) {
                    atual = atual.getNoEsq();
                } else {
                    atual = atual.getNoDir();
                }
            }
            if (atual == null) {
                System.out.println("Conteudo nao encontrado. Bloco Try");
            }
            //----Segunda etapa caso de a raiz não ser nula e encontrar o No

        } catch (NullPointerException error) {
            System.out.println("Conteudo nao encontrado. Bloco Catch");
        }
    }
}
