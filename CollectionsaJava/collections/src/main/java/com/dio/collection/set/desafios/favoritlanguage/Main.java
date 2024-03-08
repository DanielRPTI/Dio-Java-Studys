package com.dio.collection.set.desafios.favoritlanguage;
/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>() {{
            add(new LinguagemFavorita("Python", 1991, "Pycharm"));
            add(new LinguagemFavorita("JavaScript", 1995, "Eclipse"));
            add(new LinguagemFavorita("Java", 1991, "IntelliJ"));
            add(new LinguagemFavorita("NodeJs", 2000, "Visual Studio Code"));
        }};
        System.out.println("\n---\tOrdem Aleatório\t----");
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas) {
            System.out.println(linguagem);
        }

        System.out.println("\n---\tOrdem de Inserção\t----");
        Set<LinguagemFavorita> minhasLinguagensFavoritas1 = new LinkedHashSet<>(
                Arrays.asList(
                new LinguagemFavorita("Python", 1991, "Pycharm"),
                new LinguagemFavorita("JavaScript", 1995, "IntelliJ"),
                new LinguagemFavorita("Java", 1991, "Visual Studio Code")
        ));

        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas1) {
            System.out.println(linguagem);
        }


        System.out.println("---\tOrdem de Natural(Nome)\t----");
        Set<LinguagemFavorita> minhasLinguagensFavoritas2 = new TreeSet<>(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas2) {
            System.out.println(linguagem);
        }


        System.out.println("\n---\tOrdem de Natural(Nome)\t----");
        Set<LinguagemFavorita> minhasLinguagensFavoritas3 = new TreeSet<>(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem: minhasLinguagensFavoritas3) {
            System.out.println(linguagem);
        }

        System.out.println("\n---\tOrdem por IDE\t----");
        Set<LinguagemFavorita> minhasLinguagensFavoritas4 = new TreeSet<>(new ComparatorIde());
        minhasLinguagensFavoritas4.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem: minhasLinguagensFavoritas4) {
            System.out.println(linguagem);
        }

        System.out.println("\n---\tOrdem por Ano de Criação e Nome\t----");
        Set<LinguagemFavorita> minhasLinguagensFavoritas5 = new TreeSet<>(new ComparatorAnoNome());
        minhasLinguagensFavoritas5.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem: minhasLinguagensFavoritas5) {
            System.out.println(linguagem);
        }

        System.out.println("\n---\tOrdem por  Nome|Ano de Criação|IDE|\t----");
        Set<LinguagemFavorita> minhasLinguagensFavoritas6 = new TreeSet<>(new ComparatorAnoNomeIde());
        minhasLinguagensFavoritas6.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem: minhasLinguagensFavoritas6) {
            System.out.println(linguagem);
        }


    }
}


class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    private String nome;
    private Integer anoDeCriacao;
    private String IDE;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String IDE) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.IDE = IDE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(Integer anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIDE() {
        return IDE;
    }

    public void setIDE(String IDE) {
        this.IDE = IDE;
    }

    @Override
    public String toString() {
        return "{" +
                "Nome = '" + nome + '\'' +
                ", Ano De Criação = " + anoDeCriacao +
                ", IDE = '" + IDE + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return Objects.equals(nome, that.nome) && Objects.equals(anoDeCriacao, that.anoDeCriacao) && Objects.equals(IDE, that.IDE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, IDE);
    }


    @Override
    public int compareTo(LinguagemFavorita linguagem) {

       return this.getNome().compareToIgnoreCase(linguagem.getNome());
    }
}
class ComparatorIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
        return linguagem1.getIDE().compareToIgnoreCase(linguagem2.getIDE());
    }
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
        int anoCriacao = Integer.compare(linguagem1.getAnoDeCriacao(), linguagem2.getAnoDeCriacao());
        if(anoCriacao != 0) return anoCriacao;
        return linguagem1.getNome().compareToIgnoreCase(linguagem2.getNome());
    }
}

class ComparatorAnoNomeIde implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
        int nome = linguagem1.getNome().compareToIgnoreCase(linguagem2.getNome());
        int anoCriacao = Integer.compare(linguagem1.getAnoDeCriacao(), linguagem2.getAnoDeCriacao());
        if (nome != 0)return nome;
        if(anoCriacao != 0) return anoCriacao;
        return linguagem1.getIDE().compareToIgnoreCase(linguagem2.getIDE());

    }
}

