package animals;

import aviary.AviarySize;

public class Fish extends Herbivore implements Swim {
    public Fish(AviarySize aviarySize) {
        super(aviarySize);
    }

    @Override
    public void swim() {
        System.out.println("Fish swimming");
    }
}
