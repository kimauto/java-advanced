package day05.innerclass.ex06;

public class HamburgerLotteria {

    public static void main(String[] args) {
        Hamburger 병곤 = new Hamburger.BurgerBuilder("플랫","치킨", "코카콜라").addCheese().addBacon().addLettuce().build();

        System.out.println(병곤.toString());
        
        //실습: 음료가 포함되어있는 세트이다. 음료 포함 햄버가 만들어줘
    }
}
