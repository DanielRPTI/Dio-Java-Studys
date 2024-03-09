package com.dio.collection.map;

import java.util.*;

/*
Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
modelo = gol - consumo = 14,4km/l
modelo = uno - consumo = 15,6 km/l
modelo = mobi - consumo = 16,1 km/l
modelo = hb20 - consumo = 14,5 km/l
modelo = kwid - consumo = 15,6 km/l
*/
//        Map carrosPopulares2020 = new HashMap(); //antes do java 5
//        Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
//        HashMap<String, Double> carrosPopulares = new HashMap<>();
//        Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)
public class ExemploMap {
    public static void main(String[] args) {
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("palio", 15.4);
            put("mobi", 16.1);
            put("uno", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("- Substitua o consumo do gol por 15,2 km/l");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares.toString());
        //Assim como no Set não possuimos um metodo que mostre o indice
        System.out.println("- Confira se o modelo jeep se encontra no dicionário: " + carrosPopulares.containsKey("jeep"));
        System.out.println("- Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        //Através de nosso metodo keySet pegamos a chave do nosso Map
        System.out.println("- Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        // Metodo Values retorna uma collections
        System.out.println("- Exiba o consumo: ");
        Collection<Double> consumoCarros = carrosPopulares.values();
        System.out.println(consumoCarros);

        System.out.println("- Exiba o modelo mais economico e seu consumo: ");

        Double melhorConsumo = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(melhorConsumo)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelos mais eficientes " + modeloMaisEficiente + " com o melhor consumo: " + melhorConsumo);
            }
            ;
        }
        System.out.println("- Exiba o modelo menos economico e seu consumo: ");
        Double piorConsumo = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet();
        String modeloPiorConsumo = "";
        for (Map.Entry<String, Double> entry : entries1) {
            if (entry.getValue().equals(piorConsumo)) {
                modeloPiorConsumo = entry.getKey();
                System.out.println("Modelo com o consumo menos eficiente " + modeloPiorConsumo + " com o pior consumo de: " + piorConsumo);
            }
        }
        System.out.print("- Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);
        System.out.println("- Exiba a media dos consumos deste dicionário de carros: " + soma / carrosPopulares.size());
        System.out.println("- Remova os modelos com o consumo igual a 15,6 km/l: ");
        System.out.println(carrosPopulares);
        Iterator<Double> iteratorRemove = carrosPopulares.values().iterator();
        while (iteratorRemove.hasNext()) {
            if (iteratorRemove.next().equals(15.6)) iteratorRemove.remove();
        }
        System.out.println("- Carros removidos: " + carrosPopulares);

        System.out.println("Exiba na ordem em que foram inseridos");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("palio", 15.4);
            put("mobi", 16.1);
            put("uno", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);

        System.out.println("Exiba ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());
        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();
        System.out.println("Confira se o dicionar está vazio: "+ carrosPopulares.isEmpty());
    }
}

class ModelosCarros implements Comparator<ModelosCarros> {
    private String modelo;
    private Double consumo;


    @Override
    public int compare(ModelosCarros o1, ModelosCarros o2) {
        return 0;
    }
}