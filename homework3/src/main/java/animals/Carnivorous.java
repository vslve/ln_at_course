package animals;

import aviary.AviarySize;
import food.Meat;

public abstract class Carnivorous extends Animal {
    public Carnivorous(AviarySize aviarySize) {
        super(aviarySize);
        this.foodType = Meat.class;
    }
}
