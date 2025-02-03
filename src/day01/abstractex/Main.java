package day01.abstractex;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat  = new Cat();

        animalSound(dog);
        animalSound(cat);
    }

    public static void animalSound(Animal animal) {
        animal.sound();
        if (animal instanceof Dog) {
            System.out.println("강아지입니다.");
        }
    }
}
