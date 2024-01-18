package PilaresPoo.ProjetoVeiculo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("8769756");


        Moto z400 =  new Moto();
        z400.setChassi("467754");


        Veiculo coringa = z400;

        coringa.ligar();
    }
}
