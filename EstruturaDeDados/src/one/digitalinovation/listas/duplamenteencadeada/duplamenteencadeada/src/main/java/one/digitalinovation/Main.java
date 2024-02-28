package one.digitalinovation;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();

        minhaLista.add("C1");
        minhaLista.add("C2");
        minhaLista.add("C3");
        minhaLista.add("C4");
        minhaLista.add("C5");
        minhaLista.add("C6");
        minhaLista.add("C7");

        System.out.println(minhaLista);
        System.out.println(minhaLista.size());

        minhaLista.remove(3);
        System.out.println(minhaLista);

        minhaLista.add("9", 3);
        System.out.println("----elemento adicionado apos remoção do indice informado anteriormente------");
        System.out.println(minhaLista);

        System.out.println(minhaLista.get(3));

    }
}
