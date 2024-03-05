package com.dio.collection.set;

import java.sql.SQLOutput;
import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      Set notas = new HashSet(); //antes do java 5
//      HashSet<Double> notas = new HashSet<>();
//      Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
/*      Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
*/
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        //System.out.println("Exiba a posição da nota 5.0: ");
        //não é possivel pois nao temos indexOf em set , não sendo possivel trocar ou adicionar em um index

        System.out.println("Confira se a nota 5 está na lista: "+ notas.contains(5d));

        System.out.println("Exiba o menor valor: " + Collections.min(notas));
        System.out.println("Exiba o maior valor: "+ Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.printf("Exiba a soma dos valores:%.2f", soma);
        System.out.printf("\nExiba a média dos valores:%.2f",soma/ notas.size());

        System.out.println("\nRemova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Ordene a lista na ordem que foram adicionados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println("Notas ordenadas: \n"+ notas2);
        System.out.println("Ordene de forma crescente(TreeSet): ");
//      Set<Double> notas3 = new TreeSet<>(notas2);
        Set<Double> notas3 = new TreeSet<>();
        notas3.add(7d);
        notas3.add(8.5);
        notas3.add(9.3);
        notas3.add(5d);
        notas3.add(0d);
        notas3.add(3.6);
        System.out.println(notas3);
        notas3.clear();
        System.out.println("Conjunto está vazio? " + notas3.isEmpty());


    }
}
