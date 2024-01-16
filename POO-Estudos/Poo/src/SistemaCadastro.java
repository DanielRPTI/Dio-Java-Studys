public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa person = new Pessoa("Daniel Rosa", "123456");

        person.setEndereco("Rua das Marias");

        System.out.println(person.getNome() + "-" + person.getCpf() + "-" + person.getEndereco());
    }
}
