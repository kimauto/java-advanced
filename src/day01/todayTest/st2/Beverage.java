package day01.todayTest.st2;

public abstract class Beverage {

    private String name;
    private int price;

    public Beverage(String name) {
        this.name = name;
    }

    public abstract void calcPrice();
    public void print() {};


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
