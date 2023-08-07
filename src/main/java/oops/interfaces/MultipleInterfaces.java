package oops.interfaces;

class Phone {
    public void call() {
        System.out.println("Phone call");
    }

    public void sms() {
        System.out.println("Phone sending SMS");
    }
}

interface Camera {
    void click();
    void record();
}

interface MusicPlayer {
    void play();
    void stop();
}

class SmartPhone extends Phone implements Camera,MusicPlayer {
    public void videoCall() {
        System.out.println("Smart Phone video calling");
    }

    public void click() {
        System.out.println("Smart Phone Clicking Photo");
    }

    public void record() {
        System.out.println("Smart Phone recording video");
    }

    public void play() {
        System.out.println("Smart Phone playing music");
    }

    public void stop() {
        System.out.println("Smart Phone stopped playing music");
    }
}
public class MultipleInterfaces {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone ();
        sp.videoCall ();
        sp.call ();

        Phone p = sp;
        p.call ();
        p.sms ();

        MusicPlayer mp=sp;
        mp.play();
        mp.stop();

        Camera c = sp;
        c.click ();
        c.record ();
    }
}
