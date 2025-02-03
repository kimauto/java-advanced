package day01.todayTest.st2;

public class CoffeShop {

    public static void main(String[] args) {
        System.out.println("****java nara CoffeeShop영업개시****");
        Beverage[] beverage = new Beverage[5];
        beverage[0] = new Coffee("Cappuccino");
        beverage[1] = new Coffee("CafeLatte");
        beverage[2] = new Tea("ginsengTea");
        beverage[3] = new Coffee("CafeLatte");
        beverage[4] = new Tea("redginsengTea");
        getSalesInfo(beverage);

        System.out.println("총 판매 금액==>"+getTotalPrice(beverage));
        System.out.println("Coffe의 판매 개수=>"+Coffee.amount+"잔");
        System.out.println("Tea의 판매 개수=>"+Tea.amount+"잔");
    }

    private static int getTotalPrice(Beverage[] beverage) {
        int totalPrice = 0;
        for (Beverage beverage1 : beverage) {
            totalPrice += beverage1.getPrice();
        }
        return totalPrice;
    }

    private static void getSalesInfo(Beverage[] beverage) {
        int i = 1;
        for (Beverage beverage1 : beverage) {
            System.out.println(i + "번 쨰 판매 음료는 " + beverage1.getName() + "이며, 가격은 " + beverage1.getPrice());
            i++;
        }
    }








    //결과와 같이 총 판매금액을 구할 수 있도록 getTotalPrice메소드를 작성하세요.
}
