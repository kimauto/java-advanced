package day01;

public class SmartPhone extends Phone{

    //필드 선언
    public boolean wifi;

    public SmartPhone(String model, String color) {
        super(model,color);
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        internet();
    }

    public void internet(){
        System.out.println("인터넷을 연결합니다.");
    }

    public boolean isWifi() {
        return wifi;
    }

    @Override
    public void bell() {
        System.out.println("또또또");
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "wifi=" + wifi +
                '}';
    }
}
