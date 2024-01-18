package MSN;

public class MSNMenssenger {
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem");
        salvrHistoricoMensagem();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }
    private void validarConexaoInternet(){
        System.out.println("Valindo se está conectado a internet");
    }
    private void salvrHistoricoMensagem(){
        System.out.println("Salvando o historico da mensagem");
    }
}
