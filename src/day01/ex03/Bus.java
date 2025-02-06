package day01.ex03;

import java.sql.SQLOutput;

public class Bus implements Vehicle {


    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
