package day03.interfaceEx.test2;

public class TVFactory extends Factory implements IWorkingTogether{


    public TVFactory(String name,int openHour, int closeHour) {
        super(name,openHour, closeHour);
    }

    @Override
    public int makeProducts(char skill) {
        if (skill == 'A') return 8 * getWorkingTime();
        else if (skill == 'B') return 5 * getWorkingTime();
        else if (skill == 'C') return 3 * getWorkingTime();
        else return 1;
    }


    @Override
    public int workTogether(IWorkingTogether partner) { //파트너 공장의 기술력 C에 대해 하루 생산량 리턴
        return makeProducts('C');

    }
}
