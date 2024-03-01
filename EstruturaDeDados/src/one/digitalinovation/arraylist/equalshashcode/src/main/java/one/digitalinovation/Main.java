package one.digitalinovation;

//Lib Array List estrutura mais usada em projetos


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Corola"));
        listCarros.add(new Carro("Renault"));
        listCarros.add(new Carro("Fiat"));

        System.out.println(listCarros.contains(new Carro("Ford")));

        System.out.println(listCarros.get(3));
        System.out.println(listCarros.indexOf(new Carro("Corola")));

        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);
    }
}
