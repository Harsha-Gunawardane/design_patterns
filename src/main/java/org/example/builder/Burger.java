package org.example.builder;

public class Burger {
    private boolean bun;
    private boolean meat;
    private boolean cheese;

    public Burger(builder builder){}
    private Burger(){}

    public void getBurger(){
        System.out.println("Burger : \n\tbun : " + bun + "\n\tmeat : " + meat + "\n\tcheese : " + cheese + "\n");
    }

    public static class builder{
        private boolean bun;
        private boolean meat;
        private boolean cheese;

        Burger burger = new Burger();

        public builder bun(){
            burger.bun = true;
            return this;
        }
        public builder meat(){
            burger.meat = true;
            return this;
        }
        public builder cheese(){
            burger.cheese = true;
            return this;
        }

        public Burger build(){
            return burger;
        }
    }
}
