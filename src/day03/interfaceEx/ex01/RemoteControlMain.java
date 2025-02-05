package day03.interfaceEx.ex01;

import java.sql.SQLOutput;

public class RemoteControlMain {

    public static void main(String[] args) {

        RemoteControl remoteControl;

        remoteControl = new Tv();

        remoteControl.tunOn();
        remoteControl.tunOff();

        remoteControl = new Radio();

        remoteControl.tunOn();
        remoteControl.tunOff();

        System.out.println("리모콘에 최대 볼륨 " + RemoteControl.MAX_VOLUME );
        System.out.println("리모콘에 최소 볼륨 " + RemoteControl.MiN_VOLUME );



        //1.리모컨을 구입한다.
        //2.새로산 리모컨에 tv를 설정한다.
        RemoteControl newRemote = new Tv();
        //3.리모콘을 이용해 tv킴
        newRemote.tunOn();
        //4.리모콘을 이용해 볼륨 10
        newRemote.setVolume(10);
        //5.리모콘을 이용해 tv 끔
        newRemote.tunOff();

        //1. 리모컨을 라디오로 페어링 한다.
        newRemote = new Radio();
        //2. 리모컨을 이용하여 라디오를 켠다.
        newRemote.tunOn();
        //3. 리모컨을 이용하여 볼륨을 20으로 설정하고 설정값을 확인한다.
        newRemote.setVolume(20);
        //4. 리모컨을 이용하여 라디오를 끈다.
        newRemote.tunOff();
    }
}
