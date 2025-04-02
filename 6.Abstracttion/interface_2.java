interface MusicPlayer {
    void play(); 
    void stop(); 
}

class Smartphone implements MusicPlayer {
    public void play() {
        System.out.println("Playing music from Smartphone.");
    }

    public void stop() {
        System.out.println("Music stopped.");
    }
}

public class interface_2 {
    public static void main(String[] args) {
        MusicPlayer myPhone = new Smartphone(); 
        myPhone.play();
        myPhone.stop();
    }
}
