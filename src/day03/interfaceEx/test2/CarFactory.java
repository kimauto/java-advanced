package day03.interfaceEx.test2;

public class CarFactory extends Factory implements IWorkingTogether{


    public CarFactory(String name, int openHour, int closeHour) {
        super(name,openHour, closeHour);
    }

    @Override
    public int makeProducts(char skill) {
        if (skill == 'A') return 3 * getWorkingTime(); //일한 시간의 3을 곱해
        else if (skill == 'B') return 2 * getWorkingTime();
        else if (skill == 'C') return 1 * getWorkingTime();
        else return 0;
    }

    @Override
    public int workTogether(IWorkingTogether partner) { //파트너 공장의 기술력 B에 대해 하루 생산량 리턴
        return makeProducts('B');
    }
}
