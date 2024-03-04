package com.dio.collection.list;
/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);

Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/

import java.util.*;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> listGatos = new ArrayList<>() {{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "branco"));
            add(new Gato("Jon", 12, "laranja"));
        }};
        System.out.println("----\tOrdem de Inserção\t-----");
        System.out.println(listGatos);

        System.out.println("----\tOrdem de aleatória\t-----");
        Collections.shuffle(listGatos);
        System.out.println(listGatos);

        System.out.println("----\tOrdem de natural(Nome)\t-----");
        Collections.sort(listGatos);
        System.out.println(listGatos);

        System.out.println("----\tOrdem de Idade\t-----");
     //  usando Collections.sort(listGatos, new ComparatorIdade());
        listGatos.sort(new ComparatorIdade());
        System.out.println(listGatos);

        System.out.println("----\tOrdem de Cor\t-----");
        Collections.sort(listGatos, new ComparatorCor());
        System.out.println(listGatos);

        System.out.println("----\tOrdem Nome|Cor|Idade\t-----");
        System.out.println("----\tOrdem de Cor\t-----");
        listGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(listGatos);
    }

}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato, Gato gato2) {
        return Integer.compare(gato.getIdade(), gato2.getIdade());
    }
}
class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato gato, Gato gato2) {
        return gato.getCor().compareToIgnoreCase(gato2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato gato, Gato gato2) {
        int nome = gato.getNome().compareToIgnoreCase(gato2.getNome());
        //Verifica se os nomes são diferentes , se forem iguais o comparaTo será 0 e o codigo nao irá verificar por nome , mas se for ele verifica
        if (nome != 0) return nome;

        //Teste das cores , se forem iguais ele já os separa por idade  rodando nosso ultimo return
        int cor = gato.getCor().compareToIgnoreCase(gato2.getCor());
        if(cor != 0) return cor;
        //Por Idade teste final
        return Integer.compare(gato.getIdade(), gato2.getIdade());
    }
}
