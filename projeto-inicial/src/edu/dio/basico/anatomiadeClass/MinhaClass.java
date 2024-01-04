package edu.dio.basico.anatomiadeClass;

import java.util.Locale;
import java.util.Scanner;

public class MinhaClass {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Digite seu primeiro nome: ");
    String primeiroNome = sc.next() ;
    System.out.println("Digite seu segundo nome: ");
    String segundoNome = sc.next() ;
    String nomeCompleto =  nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
  }
//Como criar o seu primeiro metodo , informar o tipo de retorno e o nome do metodo
// e por fim os params a serem usados 
  public static String nomeCompleto (String primeiroNome, String segundoNome) {
   return primeiroNome.concat(" ").concat(segundoNome);
  }
}
