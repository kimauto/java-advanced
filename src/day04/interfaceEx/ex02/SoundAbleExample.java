package day04.interfaceEx.ex02;

import jdk.swing.interop.SwingInterOpUtils;

public class SoundAbleExample {
    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }

    private static void printSound(SoundAble soundAble) {
        soundAble.sound();
    }

}
