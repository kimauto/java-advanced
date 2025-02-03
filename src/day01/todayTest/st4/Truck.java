package day01.todayTest.st4;


public class Truck extends Wheeler {

    public Truck(String carName, int velocity, int wheelNumber) {
        super.carName = carName;
        super.wheelNumber = wheelNumber;
        super.velocity = velocity;
    }

    @Override
    public void speedUp(int speed) {
        if(velocity > 100){
            velocity = velocity - 100;
        }
        velocity += (speed * 5);
    }

    @Override
    public void speedDown(int speed) {
        if (velocity < 50){
            velocity = velocity + 50;
            System.out.println(super.carName + "의 최저속도위반으로 속도를 "+  speed + "으로 올립니다.");
        }
        velocity = velocity - (speed * 5);
    }

    public int getVelocity() {
        return super.velocity;
    }

    public void setVelocity(int velocity) {
        super.velocity = velocity;
    }
}
