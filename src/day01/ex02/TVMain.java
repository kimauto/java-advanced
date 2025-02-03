package day01.ex02;

public class TVMain {

    public static void main(String[] args) {

        TV tv = new TV();// 동일한 클래스 타입의 참조 변수를 생성해서 초기화

        SmartTv smartTv = new SmartTv(); // 스마트타입으로 일반 티비를 다룬다.

        TV tv1 = new SmartTv();

    }
}
