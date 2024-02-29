package one.digitalinovation;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> minhaLista = new ListaCircular<>();

        minhaLista.add("Test0");
        System.out.println(minhaLista);
        minhaLista.remove(0);
        System.out.println(minhaLista);

        minhaLista.add("Test1");
        minhaLista.add("Test2");
        minhaLista.add("Test3");
        minhaLista.add("Test4");
        minhaLista.add("Test5");
        System.out.println(minhaLista);
        System.out.println(minhaLista.get(3));
        //sempre volta na lista diversas vezes pois nao possui uma cauda nula e nem uma cabeça que aponte para um no nulo
        System.out.println(minhaLista.get(6));
    }
}
