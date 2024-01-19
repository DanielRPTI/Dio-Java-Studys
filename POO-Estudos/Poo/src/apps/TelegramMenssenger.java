package apps;

public class TelegramMenssenger extends MenssengerSender {
    @Override
    public void enviarMensagem() {
        validarConexao();
        System.out.println("Mensagem enviada pelo Telegram ");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Mensagem recebida pelo Telegram");
    }
}
