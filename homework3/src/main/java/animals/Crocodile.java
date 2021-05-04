package animals;

import aviary.AviarySize;

public class Crocodile extends Carnivorous implements Run, Swim, Voice {
    public Crocodile(AviarySize aviarySize) {
        super(aviarySize);
    }

    @Override
    public void run() {
        System.out.println("Crocodile running");
    }

    @Override
    public void swim() {
        System.out.println("Crocodile swimming");
    }

    @Override
    public String voice() {
        return "Crocodile voice";
    }
}
