package apps;

public class FacebookMenssengerSender extends MenssengerSender {
    @Override
    public void enviarMensagem() {
        validarConexao();
        System.out.println("Mensagem enviada pelo Facebook Mensseger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Mensagem recebida pelo Facebook Menssenger");
    }
}
