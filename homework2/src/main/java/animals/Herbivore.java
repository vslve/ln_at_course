package animals;

import food.Food;
import food.Grass;

public class Herbivore extends Animal {
    public Herbivore() {
        this.foodType = Grass.class;
    }

    @Override
    public void eat(Food food) {
        eatVerbose(food);
    }
}
