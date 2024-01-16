package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno daniel = new Aluno();

        daniel.setNome("Daniel Rosa");
        daniel.setIdade(21);

        System.out.println("O aluno"+ daniel.getNome() + " tem " + daniel.getIdade() + " anos");
    }
}
