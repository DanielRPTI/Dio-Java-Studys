package com.dio.collection.set.desafios.arcoiris;
/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma ao lado da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--Crie uma conjunto contendo as cores do arco-íris");
        Set<String> coresArcoIris = new HashSet<>(){{
            add("violeta");
            add("vermelho");
            add("laranja");
            add("verde");
            add("azul");
            add("anil");
            add("amarelo");
        }};
        System.out.println("--\tExiba todas as cores o arco-íris uma ao lado da outra:\t--");
        for ( String cor : coresArcoIris) {
            System.out.print( " | " + cor);
        }

        System.out.println("--\tA quantidade de cores que o arco-íris tem:\t--");
        System.out.println("- " + coresArcoIris.size() + " cores." );

        System.out.println("--\tOrdem Alfabética:\t--");
        Set<String> coresArcoIris1 = new TreeSet<>();
        coresArcoIris1.addAll(coresArcoIris);
        for ( String cor : coresArcoIris1) {
            System.out.print( " | " + cor);
        }
        System.out.println("\n");
        System.out.println("--\tOrdem Inversa da Inserção:\t--");
        ArrayList<String> corArcoIris2 = new ArrayList<>(){{
            add("violeta");
            add("vermelho");
            add("laranja");
            add("verde");
            add("azul");
            add("anil");
            add("amarelo");
        }};
        Collections.sort(corArcoIris2, Collections.reverseOrder());
        for ( String cor : corArcoIris2) {
            System.out.print( " | " + cor);
        }

        System.out.println("\n");
        System.out.println("--\tExiba todas as cores que começam com a letra ”v”:\t--");
        for (String cor: corArcoIris2) {
            if (cor.toLowerCase().startsWith("v")) System.out.print(" | " + cor);
        }

        System.out.println("\n");
        System.out.println("--\tRemova todas as cores que não começam com a letra “v”:\t--");
        Iterator<String> iterator = corArcoIris2.iterator();
        while(iterator.hasNext()){
            String cor = iterator.next();
            if(!cor.toLowerCase().startsWith("v"))iterator.remove();
        }
        for ( String cor : corArcoIris2) {
            System.out.print( " | " + cor);
        }
        coresArcoIris.clear();
        System.out.println(coresArcoIris.isEmpty());


    }
}
