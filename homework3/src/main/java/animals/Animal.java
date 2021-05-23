package animals;

import aviary.AviarySize;
import exceptions.WrongFoodException;
import food.Food;

import java.util.Objects;

public abstract class Animal {
    protected static int instanceNumber;
    protected Class<? extends Food> foodType;
    protected AviarySize aviarySize;
    protected int satiety;
    protected int id;

    public Animal(AviarySize aviarySize) {
        instanceNumber += 1;
        id = instanceNumber;
        this.aviarySize = aviarySize;
    }

    public AviarySize getAviarySize() {
        return aviarySize;
    }

    public void setAviarySize(AviarySize aviarySize) {
        this.aviarySize = aviarySize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, satiety);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Animal animal = (Animal) obj;
        return id == animal.id && this.satiety == animal.satiety;
    }

    public int getId() {
        return id;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public void eat(Food food) {
        if (checkFoodAccordance(food)) {
            eatItUp(food);
            System.out.println(getEatingDescription(food));
        } else {
            throw new WrongFoodException(getNotAccordanceFoodMessage(food));
        }
    }

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
}
