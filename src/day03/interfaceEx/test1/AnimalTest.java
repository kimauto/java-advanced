package day03.interfaceEx.test1;

public class AnimalTest {
    public static void main(String[] args) {

        Animal dog = new Dog(8);
        Animal chicken = new Chicken(3);
        Chicken cheatableChicken = new Chicken(5);

        Animal[] animals = {dog, chicken, cheatableChicken};
        cheatAble(animals);
        for (int i = 1; i < 4; i++) {

            int a = 1;
            System.out.println(i + "시간 후");
            dog.run(a);
            chicken.run(a);
            cheatableChicken.run(a);
            System.out.println("개의 이동 거리 = " + dog.getDistance());
            System.out.println("닭의 이동 거리 = " + chicken.getDistance());
            System.out.println("날으는 닭의 이동 거리 = " + cheatableChicken.getDistance());
        }
    }

    public static void cheatAble(Animal[] cheat) {
        for (Animal animal : cheat) {
            if (animal instanceof Cheatable ct) ct.fly();

        }
    }

}
