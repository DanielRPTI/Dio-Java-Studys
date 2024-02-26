import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AppTratamentoExcecoes {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        try {
        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = sc.next();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        System.out.printf("Ola, me chamo %s %s e tenho %d minha altur é %.2f",nome, sobrenome, idade, altura );
        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser númericos");
        }

    }
}
