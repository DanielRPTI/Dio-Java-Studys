package one.digitalinovation;

//Set(HashSet) List estrutura mais usada em projetos

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Hash Set padrão adiciona de forma desordenada
        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Ferrari"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Corola"));
        hashSetCarros.add(new Carro("Zip"));
        hashSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(hashSetCarros);
        //Utilizando TreeSet podemos organizar nossa lista como o modelo de arvore binaria
        Set<Carro> treeSetCarros = new TreeSet<>();
        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Ferrari"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Corola"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(treeSetCarros);

    }
}
