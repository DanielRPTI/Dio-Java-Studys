package FunctionsDevice.PhoneCall;

public class PhoneCall implements Call, Answer, VoiceMenssenger {

    @Override
    public void answerCall(){
        System.out.println("Answer Call");
    };

    @Override
    public void declineCall() {
        System.out.println("Decline Call");

    }

    @Override
    public void calling() {
        System.out.println("Calling...");
        System.out.println("Call has been answer!");
    }

    @Override
    public void listenVoiceMenssenger() {
        System.out.println("Listen Voice Menssenger");
    }
}
