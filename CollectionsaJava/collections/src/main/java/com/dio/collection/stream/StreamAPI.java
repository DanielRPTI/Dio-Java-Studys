package com.dio.collection.stream;

import java.util.*;
import java.util.stream.Collectors;

//Operaçoes itermediarias e  =  pode ser utilizado mais de uma operação
//Operaçoes terminais  =  so pode utilizar apenas uma
public class StreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "6", "5");
//        System.out.println("Imprima todas os elemntos desta lista de string: ");
//      //uma forma de ser feita ->  numerosAleatorios.stream().forEach(System.out::println);
//        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números da lista e coloque dentro de um set: ");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        System.out.println("Transforme essa List de String para Inteiros");
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());


    }
}
