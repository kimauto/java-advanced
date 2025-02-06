package day04.interfaceEx.ex01;

import java.sql.SQLOutput;

public class TV implements Remocon{

    @Override
    public void powerOn() {
        System.out.println("TV를 켰습니다.");
    }
    public static void main(String[] args) {
        Remocon r = new TV();
        r.powerOn();
    }
}


