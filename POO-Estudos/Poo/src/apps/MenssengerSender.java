package apps;

public abstract class MenssengerSender  {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

//    public abstract  void salvarHistoricoMensagem();
    //Apenas os filhos da classe MenssengerSender podem acessar a validação
    protected  void validarConexao(){
        System.out.println("Validando se está conectado a internet!");
    }
}
