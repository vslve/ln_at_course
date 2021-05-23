package animals;

import aviary.AviarySize;

public class Duck extends Herbivore implements Swim, Fly, Run, Voice {
    public Duck(AviarySize aviarySize) {
        super(aviarySize);
    }

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
