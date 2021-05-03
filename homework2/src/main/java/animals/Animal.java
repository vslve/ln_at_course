package animals;

import food.Food;

public abstract class Animal {
    protected Class<? extends Food> foodType;
    protected int satiety;

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public abstract void eat(Food food);

    protected String getEatingDescription(Food food) {
        return this.getClass().getSimpleName() + " eating " + food.getClass().getSimpleName();
    }

    protected String getNotAccordanceFoodMessage(Food food) {
        return "It's not for " + this.getClass().getSimpleName() + ": " + food.getClass().getSimpleName();
    }

    protected void eatItUp(Food food) {
        satiety += food.getRichness();
    }

    protected Boolean checkFoodAccordance(Food food) {
        return this.foodType.isInstance(food);
    }

    protected void eatVerbose(Food food) {
        if (checkFoodAccordance(food)) {
            eatItUp(food);
            System.out.println(getEatingDescription(food));
        } else {
            System.out.println(getNotAccordanceFoodMessage(food));
        }
    }
}
