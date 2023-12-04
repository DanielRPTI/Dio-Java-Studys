package edu.dio.basico.metodos;

public class Usuario {
  public static void main(String[] args) {
    Tv smartTv = new Tv();
    System.out.println("Tv ligada? " + smartTv.ligada);
    System.out.println("Canal atual? " + smartTv.canal);
    System.out.println("Volume atual? " + smartTv.volume);

// liga e desliga :
    smartTv.ligar();
      System.out.println("Tv ligada? " + smartTv.ligada);
    smartTv.desligar();
      System.out.println("Tv ligada? " + smartTv.ligada);

// aumenta e diminui volume 
    smartTv.aumentarVolume();
    System.out.println("Volume aumentado: " + smartTv.volume);

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    System.out.println("Volume atual" + smartTv.volume);
//muda canal
    System.out.println("Canal atual: " + smartTv.canal);
    smartTv.mudarCanal(13);
    System.out.println("Canal atual: " + smartTv.canal);
  }
}
