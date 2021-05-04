import animals.*;
import food.*;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        final Animal[] animals = {
                new Duck(),
                new Fish(),
                new Eagle(),
                new Bear(),
                new Crocodile(),
                new Got()
        };

        final Food[] food = {
                new Clover(),
                new Seaweed(),
                new Beef(),
                new Pork()
        };

        Worker worker = new Worker("Worker");

        for (Animal animal : animals) {
            for (Food foodUnit : food) {
                worker.feed(animal, foodUnit);
            }
            try {
                worker.getVoice((Voice) animal);
            } catch (ClassCastException e) {
                System.out.println(animal.getClass().getSimpleName() + " is not Voice type animal");
            }
            System.out.println();
        }

        final ArrayList<Swim> pond = new ArrayList<>();

        for (Animal animal : animals) {
            try {
                pond.add((Swim) animal);
            } catch (ClassCastException e) {
                System.out.println(animal.getClass().getSimpleName() + " is not Swim type animal");
            }
        }

        for (Swim animal : pond) {
            animal.swim();
        }
    }
}
