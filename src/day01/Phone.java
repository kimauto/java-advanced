package day01;

public class Phone {
    //필드 선언
    public String model;
    public String color;

    public Phone() {
    }

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    //메소드
    public void bell(){
        System.out.println("띠링띠링 벨이 울린다. ");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
