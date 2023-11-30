public class MinhaClass {
  public static void main(String[] args) {
    String primeiroNome = "Daniel";
    String segundoNome =  "Junior";

    String nomeCompleto =  nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
  }
//Como criar o seu primeiro metodo , informar o tipo de retorno e o nome do metodo
// e por fim os params a serem usados 
  public static String nomeCompleto (String primeiroNome, String segundoNome) {
   return primeiroNome.concat(" ").concat(segundoNome);
  }
}
