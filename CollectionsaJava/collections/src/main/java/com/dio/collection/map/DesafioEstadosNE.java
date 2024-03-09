package com.dio.collection.map;

import java.util.*;

public class DesafioEstadosNE {
    public static void main(String[] args) {
        Map<String, Integer> estadosNe = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println("--\tEstados NE\t--");
        System.out.println(estadosNe);
        //Substituta a população do estado RN por 3534165
        estadosNe.put("RN", 3534165);
        System.out.println("--\tEstado RN atualizado\t--");
        for (Map.Entry<String, Integer> entry: estadosNe.entrySet()) {
            if(entry.getKey().equals("RN")){
                System.out.println(entry.getKey()+" - " + entry.getValue());
            }
        }
        System.out.println("--\tConfira se o Estado PB está no dicionário, caso não adicione: PB - 4039277\t--");
        if (estadosNe.containsKey("PB")){
            System.out.println(estadosNe);
        }else {
            estadosNe.put("PB", 4039277);
            System.out.println("PB foi adicionado ao dicionario pois ele não existe");
        }
        for (Map.Entry<String, Integer> entry: estadosNe.entrySet()) {
                System.out.println(entry.getKey()+" - " + entry.getValue());
        }
        System.out.println("- População do estado PE: "+ estadosNe.get("PE"));
        System.out.println("--\tExiba na ordem de Inserção\t--");
        Map<String,Integer> estadosNe1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        for (Map.Entry<String, Integer> entry: estadosNe1.entrySet()) {
            System.out.println(entry.getKey()+" - " + entry.getValue());
        }

        System.out.println("--\tExiba na ordem de alfabética\t--");
        Map<String, Integer> estadosNe2 = new TreeMap<>(estadosNe);
        for (Map.Entry<String, Integer> entry: estadosNe2.entrySet()) {
            System.out.println(entry.getKey()+" - " + entry.getValue());
        }

        System.out.println("--\tExiba o estado com a menor população\t--");
        Integer menorPopul = Collections.min(estadosNe2.values());
        String cidadeMenorPopul = "";
        for (Map.Entry<String, Integer> entry: estadosNe2.entrySet()) {
            if (entry.getValue().equals(menorPopul)){
                cidadeMenorPopul = entry.getKey();
                System.out.println("A cidade com menor população foi "+ cidadeMenorPopul+ " com "+ menorPopul +" habitantes");
            }
        }
        System.out.println("--\tExiba o estado com a maior população\t--");
        Integer maiorPopul = Collections.max(estadosNe2.values());
        String cidadeMaiorPopul = "";
        for (Map.Entry<String, Integer> entry: estadosNe2.entrySet()) {
            if (entry.getValue().equals(maiorPopul)){
                cidadeMaiorPopul = entry.getKey();
                System.out.println("A cidade com maior população foi "+ cidadeMaiorPopul+ " com "+ maiorPopul +" habitantes");
            }
        }
        System.out.println("--\tExiba a soma da populção dos estados\t--");
        Iterator<Integer> iterator = estadosNe2.values().iterator();
        Integer soma = 0;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Soma => " + soma );
        System.out.println("Média => " + soma/estadosNe2.size() );

        System.out.println("--\tRemova os estados com a população menor que 4000000\t--");
        Iterator<Integer> iterator1 = estadosNe2.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next() <= 4000000) iterator1.remove();
        }
        for (Map.Entry<String, Integer> entry: estadosNe2.entrySet()) {
            System.out.println(entry.getKey()+" - " + entry.getValue());
        }
        System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");
        estadosNe2.clear();
        System.out.println(estadosNe2);

        System.out.println("Confira se a lista está vazia: " + estadosNe2.isEmpty());

    }
}
