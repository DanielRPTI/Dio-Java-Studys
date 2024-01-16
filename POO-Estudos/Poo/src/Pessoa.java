public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    //Método COntruction : utilizar quando é preciso mais de uma informação especifica para criar um objeto , não utilizar sempre.
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String newEndereco) {
        endereco = newEndereco;
    }
}
