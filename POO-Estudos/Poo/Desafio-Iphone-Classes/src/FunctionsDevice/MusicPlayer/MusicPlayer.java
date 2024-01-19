package FunctionsDevice.MusicPlayer;

public class MusicPlayer implements  SelectMusic, PlayMusic, Pause{
        public void play(){
                System.out.println("Playing music");
        };
        public void pause(){
                System.out.println("Music has been pause");
        };
        public void select(){
                System.out.println("Music has been selected");
        };

}
