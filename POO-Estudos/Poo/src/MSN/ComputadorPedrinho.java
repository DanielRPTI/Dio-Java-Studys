package MSN;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMenssenger msn  =  new MSNMenssenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMenssengerSender fcb  =  new FacebookMenssengerSender();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        TelegramMenssenger telegram  =  new TelegramMenssenger();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
