package com.dio.collection.map;


import java.util.*;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);

Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/
public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("--\tOrdem Aleatória\t--");
        Map<String, Livro> meusLivros = new HashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
                    put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};


        System.out.println("--\tOrdem Inserção\t--");
        System.out.println("--\tOrdem alfabética autores\t--");
        System.out.println("--\tOrdem alfabética nomes dos livros\t--");
        System.out.println("--\tOrdem número de página\t--"); //Para o aluno realizar
    }
}
class Livro{
    private String nome;
    private Integer paginas;

    public Livro(String nome,Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getAutor() {
        return nome;
    }

    public void setAutor(String autor) {
        this.nome = autor;
    }


    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(paginas, livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
