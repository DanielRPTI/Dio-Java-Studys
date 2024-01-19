package apps;

public class MSNMenssenger extends MenssengerSender {
    @Override
    public void enviarMensagem() {
        validarConexao();
        System.out.println("Mensagem enviada pelo MSN Mensseger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Mensagem recebida pelo MSN Menssenger");
    }
}
