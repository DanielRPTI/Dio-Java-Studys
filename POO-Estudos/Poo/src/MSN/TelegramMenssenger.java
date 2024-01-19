package MSN;

public class TelegramMenssenger extends MenssengerSender{
    @Override
    public void enviarMensagem() {
        System.out.println("Mensagem enviada pelo Telegram ");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Mensagem recebida pelo Telegram");
    }
}
