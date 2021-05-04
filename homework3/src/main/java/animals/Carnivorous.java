package animals;

import aviary.AviarySize;
import food.Food;
import food.Meat;

public class Carnivorous extends Animal {
    public Carnivorous(AviarySize aviarySize) {
        super(aviarySize);
        this.foodType = Meat.class;
    }
}
