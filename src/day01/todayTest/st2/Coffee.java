package day01.todayTest.st2;

public class Coffee extends Beverage{

    public static int amount;

    public Coffee(String name) {
        super(name);
        amount++;
        calcPrice();
    }

    @Override
    public void calcPrice() {
        if (super.getName().equals("Americano")) super.setPrice(1500);
        else if (super.getName().equals("CafeLatte")) super.setPrice(2500);
        else if (super.getName().equals("Cappuccino")) super.setPrice(3000);

    }
}
