package MSN;

import apps.FacebookMenssengerSender;
import apps.MSNMenssenger;
import apps.MenssengerSender;
import apps.TelegramMenssenger;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MenssengerSender smi = null;

        String chooseApp = "msn";

        if(chooseApp.equals("msn"))
            smi = new MSNMenssenger();
        else if(chooseApp.equals("fbm"))
            smi = new FacebookMenssengerSender();
        else if (chooseApp.equals("tlg"))
            smi = new TelegramMenssenger();

        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
