package day03.interfaceEx.ex01;

public interface RemoteControl {

     public static final int MAX_VOLUME = 30;
     int MiN_VOLUME = 0; //-> 이렇게해도 상수 처리가 됨

     void  tunOn();
     void  tunOff();

     void setVolume(int volume);



     //배터리 교체 기능을 정적 메소드를 통해서 구현

     public static void changeBattery(){
          System.out.println("건전지를 교체합니다.");
     }
}


