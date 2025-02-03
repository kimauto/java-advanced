package day01.todayTest.st2;

public class Tea extends Beverage{
    public static int amount;

    public Tea(String name) {
        super(name);
        amount++;
        calcPrice();
    }


    @Override
    public void calcPrice() {
        if (super.getName().equals("lemonTea")) super.setPrice(1500);
        else if (super.getName().equals("ginsengTea")) super.setPrice(2000);
        else if (super.getName().equals("redginsengTea")) super.setPrice(2500);
    }
}
