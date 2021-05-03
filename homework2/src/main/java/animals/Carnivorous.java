package animals;

import food.Food;
import food.Meat;

public class Carnivorous extends Animal {
    public Carnivorous() {
        this.foodType = Meat.class;
    }

    @Override
    public void eat(Food food) {
        eatVerbose(food);
    }
}
