package animals;

import aviary.AviarySize;

public class Got extends Herbivore implements Run, Voice, Swim {
    public Got(AviarySize aviarySize) {
        super(aviarySize);
    }

    @Override
    public void run() {
        System.out.println("Got running");
    }

    @Override
    public void swim() {
        System.out.println("Got swimming");
    }

    @Override
    public String voice() {
        return "Got voice";
    }
}
