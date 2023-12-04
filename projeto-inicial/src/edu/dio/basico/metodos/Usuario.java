package edu.dio.basico.metodos;

public class Usuario {
  public static void main(String[] args) {
    Tv smartTv = new Tv();
    System.out.println("Tv ligada? " + smartTv.ligada);
    System.out.println("Canal atual? " + smartTv.canal);
    System.out.println("Volume atual? " + smartTv.volume);

    smartTv.ligar();
      System.out.println("Tv ligada? " + smartTv.ligada);

  }
}
