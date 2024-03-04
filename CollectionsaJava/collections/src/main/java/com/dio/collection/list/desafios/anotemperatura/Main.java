package com.dio.collection.list.desafios.anotemperatura;

import java.sql.SQLOutput;
import java.util.*;

/*Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        List<Double> temperaturas = new ArrayList<>();
        //adicionando as temperatuas dentro da lista
        //criando variavel count para ser atribuida no looping
        for (int i = 0; i < 6; i++) {
            System.out.println("Informe a temperatura do més " + (i + 1) + ": ");
            double temp = sc.nextDouble();
            temperaturas.add(temp);
        }
        //Exibir todas as temperaturas
        System.out.println("Todas temperaturas: ");
        temperaturas.forEach(t -> System.out.print(t + "--"));

        //* Soma temperaturas utilizando Iterarors:
//        Iterator<Double> iterator = temperaturas.iterator();
//        double somaTemperaturas = 0d;
//        while(iterator.hasNext()){
//            double next = iterator.next();
//            somaTemperaturas += next;
//        }
        /*Metodo usando Streams para calcular a media , convertemos nossa lista em uma Stream(é uma sequencia de elementos que pode ser processada de maneira concisa e funcional)
        - Aqui atribuimos a conversão toda a variavel media.
        - Utilizamos o mapToDouble() mapeia cada elemento da stream para seu valor double correspondente em ´Double::double´ fazemos uma referencia de metodo que converte cada elemento pro tipo double
        - Por fim usamos o metodo average() para realizar o calculo medio dos valores pertencentes na stream
        - OrElse é apenas para setarmos um valor padrão caso nosso List seja vazio
        */
        double media = temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0d);
        System.out.printf("\nMédia das temperaturas: %.1f\n", media);


        //double mediaTemperatura = somaTemperaturas/temperaturas.size();
        System.out.println("\nTemperaturas Semestrais:  " + temperaturas);
        System.out.printf("\nA média da temperatura semestral foi de: %.1f " , media , " oC");

        /*Exibindo as temperaturas acima da média informada acima:
          - Vamos dar inicio utilizando as Streams para usarmos o metodo filter e forEach para percorrermos a lista
          - Filter faz por si só o nome do proprio metodo , configuramos o filter com o nosso lambda temp e fazemos logo em seguida receber o parametro a ser filtrado
          - ForEach já conhecido percorre nossa lista de forma dinamica e simples , retornando ela de forma formatada
        */
        System.out.println("\n==========Temperaturas acima da média==========");
        temperaturas.stream()
                .filter(temp -> temp > media)
                .forEach(temp -> System.out.printf("%.1f", temp));

        System.out.println("\n=========Mostrando as temperaturas por extenso==========");
        System.out.println("\nMeses da temperaturas acima da média: ");

        Iterator<Double> iterator = temperaturas.iterator();

        int count = 0;

        while (iterator.hasNext()) {
            double temp = iterator.next();
            if (temp > media) {
                switch (count) {
                    case (0):
                        System.out.printf("%d - Janeiro %.1f", count, temp);
                        break;
                    case (1):
                        System.out.printf("%d - Fevereiro %.1f", count, temp);
                        break;
                    case (2):
                        System.out.printf("%d - Março %.1f", count, temp);
                        break;
                    case (3):
                        System.out.printf("%d - Abril %.1f", count, temp);
                        break;
                    case (4):
                        System.out.printf("%d - Maio %.1f", count, temp);
                        break;
                    case (5):
                        System.out.printf("%d - Junho %.1f", count, temp);
                        break;
                    default:
                        System.out.println("Não houve temperaturas acima da média");
                }
            }
            count++;
        }
    }


}



