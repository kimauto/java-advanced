package day05.innerclass.ex06;

import lombok.Data;
import lombok.Getter;



public class Hamburger {
    //필수 멤버
    private String bun;
    private String patty;
    private String coke;

    //선택 멤버
    private boolean cheese;
    private boolean lettuce;
    private boolean tomato;
    private boolean bacon;

    private Hamburger(BurgerBuilder builder) {

        this.bun = builder.bun;
        this.patty = builder.patty;
        this.coke = builder.drink;
        this.cheese = builder.cheese;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
        this.bacon = builder.bacon;
    }

    public static class BurgerBuilder {
        private String bun;
        private String patty;
        private String drink;

        private boolean cheese = false;
        private boolean lettuce = false;
        private boolean tomato = false;
        private boolean bacon = false;

        public BurgerBuilder(String patty, String bun,  String coke) {
            this.patty = patty;
            this.bun = bun;
            this.drink = coke;
        }

        public BurgerBuilder addCheese() {
            this.cheese = true;
            return this;
        }

        public BurgerBuilder addLettuce() {
            this.lettuce = true;
            return this;
        }
        public BurgerBuilder addCoke() {
            this.drink = drink;
            return this;
        }
        public BurgerBuilder addTomato() {
            this.tomato = true;
            return this;
        }

        public BurgerBuilder addBacon() {
            this.bacon = true;
            return this;
        }
        public Hamburger build() {
            return new Hamburger(this);
        }

    }



}
