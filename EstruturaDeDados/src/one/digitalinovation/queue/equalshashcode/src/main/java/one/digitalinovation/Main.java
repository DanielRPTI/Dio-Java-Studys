package one.digitalinovation;

//Lib de Queue(Fila) funcionamento parecido com a logica de Fila existente na estrutura do java


import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Carro> queueCarro = new LinkedList<>();

        queueCarro.add(new Carro("Ford"));
        queueCarro.add(new Carro("Fiat"));
        queueCarro.add(new Carro("Corola"));

        System.out.println(queueCarro);
        System.out.println(queueCarro.add(new Carro("Jeep")));
        System.out.println(queueCarro);

        System.out.println(queueCarro.offer(new Carro("Renault")));
        System.out.println(queueCarro);

        System.out.println(queueCarro.peek());
        System.out.println(queueCarro);
        //remove como na fila o primeiro elemento
        System.out.println(queueCarro.poll());
        System.out.println(queueCarro);

        System.out.println(queueCarro.isEmpty());

        System.out.println("O tamanho da nossa lista de carros é: " + queueCarro.size());
    }
}
