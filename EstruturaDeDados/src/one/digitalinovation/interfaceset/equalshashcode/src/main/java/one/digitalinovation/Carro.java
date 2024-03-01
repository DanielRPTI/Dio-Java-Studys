package one.digitalinovation;

import java.util.Objects;

public class Carro implements Comparable<Carro> {
    String marca;

    public Carro(String marca) {
        this.marca = marca;
    }
/*
* São responsaveis por realizar uma busca melhor do objeto através de um hash , e comparar os objetos através do equals
*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(marca, carro.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }



    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }
//Importante conhecer o metodo compareTo pois sem ele nao conseguimos implementar o metodo TreeSet
//    @Override
//    public int compareTo(Carro o) {
//        if(this.marca.length() < o.marca.length()){
//            return -1;
//        }else if (this.marca.length() > o.marca.length()){
//            return 1;
//        }
//        return 0;
//    }
    //Modelo alfabetico do compareTo diferente do de cima que puxa por tamanho de cracteres
    @Override
    public int compareTo(Carro o){
        return this.getMarca().compareTo(o.getMarca());
    }
}

