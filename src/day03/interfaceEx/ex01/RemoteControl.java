package day03.interfaceEx.ex01;

public interface RemoteControl {

     public static final int MAX_VOLUME = 30;
     int MiN_VOLUME = 0; //-> 이렇게해도 상수 처리가 됨

     void  tunOn();
     void  tunOff();

     void setVolume(int volume);
}


