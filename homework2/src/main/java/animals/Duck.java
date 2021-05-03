package animals;

import food.Food;

public class Duck extends Herbivore implements Swim, Fly, Run, Voice {
    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void run() {
        System.out.println("Duck running");
    }

    @Override
    public void swim() {
        System.out.println("Duck swimming");
    }

    @Override
    public String voice() {
        return "Duck voice";
    }
}
