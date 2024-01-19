package Iphone;

import FunctionsDevice.MusicPlayer.MusicPlayer;
import FunctionsDevice.PhoneCall.PhoneCall;
import FunctionsDevice.Safari.Safari;

public class IphonePedrinho {
    public static void main(String[] args) {
        PhoneCall pc = new PhoneCall();
        MusicPlayer mp = new MusicPlayer();
        Safari web  = new Safari();

        System.out.println("-----Teste de Ligação-----");
        pc.calling();
        pc.answerCall();
        pc.listenVoiceMenssenger();

        System.out.println("------Teste de Midia Player-------");
        mp.play();
        mp.pause();
        mp.select();
        System.out.println("------Teste Safari-------");
        web.addPage();
        web.refreshPage();
        web.showPage();
    }

}
