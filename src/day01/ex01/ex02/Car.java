package day01.ex01.ex02;

public class Car {
    public Tire tire1;
    public Tire tire2;

    public Car(Tire tire1, Tire tire2) {
        this.tire1 = tire1;
        this.tire2 = tire2;
    }

    public void run(){
        tire1.roll();
        tire2.roll();
    }

    public void changeTire(Tire tire1, Tire tire2){
        this.tire1 = tire1;
        this.tire2 = tire2;
    }
}
