package animals;

import aviary.AviarySize;
import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {
    public Herbivore(AviarySize aviarySize) {
        super(aviarySize);
        this.foodType = Grass.class;
    }
}
