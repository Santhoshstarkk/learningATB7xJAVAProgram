package Abstraction;

public class MainClass {
    public static void main(String[] args) {
        RemoteControl MyTvRemote = new TVRemote();
        RemoteControl MyAcRemote = new AcRemote();

        MyTvRemote.PressPowerButton();
        MyAcRemote.PressPowerButton();

    }
}