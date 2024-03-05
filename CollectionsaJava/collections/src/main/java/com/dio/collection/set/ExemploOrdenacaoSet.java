package com.dio.collection.set;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);

Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/


import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhaSeries = new HashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "suspense", 60));
            add(new Serie("that '70s show", "fantasia", 25));
            add(new Serie("grays anatomy", "drama", 45));
            add(new Serie("broklyn 99", "comedia", 15));
        }};
        for (Serie serie : minhaSeries)
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - " + serie.getDuracao());

        System.out.println("--\tOrdem de inserção\t--");
        Set<Serie> minhaSeries2 = new LinkedHashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "fantasia", 25));
        }};
        for (Serie serie : minhaSeries2)
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - " + serie.getDuracao());

        System.out.println("--\tOrdem  Natural(Tempo Episódio)\t--");
        Set<Serie> minhaSeries3 = new TreeSet<>(minhaSeries2);
        for (Serie serie : minhaSeries3)
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - " + serie.getDuracao());

        System.out.println("--\tOrdem  Nome|Gênero|Duração\t--");
        Set<Serie> minhaSeries4 = new TreeSet<>(new ComparatorNomeGeneroDuracao());
        //
        minhaSeries4.addAll(minhaSeries);
        for (Serie serie : minhaSeries4)
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - " + serie.getDuracao());
        System.out.println("--\tOrdem gênero\t--");
        Set<Serie> minhaSeries5 = new TreeSet<>(new ComparatorGenero());
        minhaSeries5.addAll(minhaSeries);

        for (Serie serie : minhaSeries5)
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - " + serie.getDuracao());


        //Pra você
/*        System.out.println("--\tOrdem gênero\t--");

          System.out.println("--\tOrdem Tempo Episódio\t--");
 */

    }

}


class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer duracao;

    public Serie(String nome, String genero, Integer duracao) {
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }


    @Override
    public java.lang.String toString() {
        return "{" +
                "nome=" + nome +
                ", genero=" + genero +
                ", duracao=" + duracao +
                "}-->";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(duracao, serie.duracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, duracao);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempo = Integer.compare(this.getDuracao(), serie.getDuracao());
        if (tempo != 0) return tempo;
        return this.getGenero().compareTo(serie.getGenero());
    }

}
class ComparatorNomeGeneroDuracao implements Comparator<Serie>{
    @Override
    public int compare(Serie serie1, Serie serie2) {
        int nome =  serie1.getNome().compareTo(serie2.getNome());
        if(nome != 0) return nome;

        int genero = serie1.getGenero().compareTo(serie2.getGenero());
        if(genero != 0) return genero;

        return Integer.compare(serie1.getDuracao(), serie2.getDuracao());


    }
}
class ComparatorGenero implements Comparator<Serie>{

    @Override
    public int compare(Serie serie1, Serie serie2) {
        /*
        Anotação: em Set quando verificamos os conteudos , os que são iguais eles são sobrescritos.
        Assim criamos a variavel genero para verificar primeiro se o que esta sendo verificando não é igual
        se for ele passa a fazer a ordenação por  duração e não pelo genero
         */
        int genero = serie1.getGenero().compareTo(serie2.getGenero());
        if(genero != 0) return genero;
        return Integer.compare(serie1.getDuracao(), serie2.getDuracao());
    }
}

