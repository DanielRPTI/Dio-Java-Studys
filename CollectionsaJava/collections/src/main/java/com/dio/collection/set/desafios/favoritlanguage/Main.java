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
            add(new LinguagemFavorita("JavaScript", 1995, "Visual Studio"));
            add(new LinguagemFavorita("Java", 1991, "IntelliJ"));
            add(new LinguagemFavorita("NodeJs", 1991, "Visual Studio Code"));
        }};
        System.out.println("---\tOrdem Aleatório\t----");
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas) {
            System.out.println(linguagem);
        }

        System.out.println("---\tOrdem de Inserção\t----");
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
                "nome = '" + nome + '\'' +
                ", anoDeCriacao = " + anoDeCriacao +
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

