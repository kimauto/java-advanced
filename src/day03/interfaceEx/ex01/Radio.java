package day03.interfaceEx.ex01;

public class Radio implements RemoteControl{

    private int volume;


    @Override
    public void tunOn() {
        System.out.println("라디오를 켭니다.");
    }

    @Override
    public void tunOff() {
        System.out.println("라디오를 끕니다.");

    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
            System.out.println("현재 해당 제품의 불륨 최댓값으로 셋팅 되었습니다.");
        }else if(volume < RemoteControl.MiN_VOLUME  ){
            this.volume = RemoteControl.MiN_VOLUME;
            System.out.println("mute");
        }else {
            this.volume = volume;
        }
        System.out.println("현재 볼륨은 " + this.volume);
    }
}
