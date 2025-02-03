package day01.todayTest.st4;

public class Bike extends Wheeler{


    public Bike(String carName, int velocity, int wheelNumber) {
        super.carName = carName;
        super.wheelNumber = wheelNumber;
        super.velocity = velocity;

    }

    @Override
    public void speedUp(int speed) {
        if(velocity > 40){
            velocity = 40;
            System.out.println(velocity);
        }
        velocity += (speed * 5);
    }

    @Override
    public void speedDown(int speed) {
        if (velocity < 10){
            velocity = 10;
            System.out.println(super.carName + "의 최저속도위반으로 속도를 " + speed + "으로 올립니다.");
        }
        velocity = velocity - speed ;
    }

}

