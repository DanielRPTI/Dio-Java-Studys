package MSN;

public class MSNMenssenger extends MenssengerSender{
    @Override
    public void enviarMensagem() {
        System.out.println("Mensagem enviada pelo MSN Mensseger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Mensagem recebida pelo MSN Menssenger");
    }
}
