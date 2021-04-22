package model;


public class Kotik {
    public static int instanceNumber;

    private String name = "";
    private String meow = "";
    private int weight;
    private int prettiness;
    private int satiety;

    public Kotik() {
        instanceNumber++;
        this.satiety = (int) (Math.random() * 5) + 5;
    }

    public Kotik(String name, String meow, int weight, int prettiness) {
        this();
        this.name = name;
        this.meow = meow;
        this.weight = weight;
        this.prettiness = prettiness;
    }

    public void liveAnotherDay() {
        for (int hour = 0; hour < 24; ++hour) {
            System.out.printf("%d: ", hour + 1);
            if(!chooseActivity()) {
                getMeal();
            }
        }
    }

    private void getMeal() {
        final int eatVariants = 3;
        final String[] mealVariants = {"cat food", "cat food1", "cat food2"};

        final int customMealCount = (int) (Math.random() * 5) + 5;
        final String meal = mealVariants[(int) (Math.random() * mealVariants.length)];

        switch ((int) (Math.random() * eatVariants)) {
            case 0:
                eat(meal, customMealCount);
                break;
            case 1:
                eat();
                break;
            case 2:
                eat(customMealCount);
                break;
        }
    }

    private boolean chooseActivity() {
        final int actionsNumber = 5;

        switch ((int) (Math.random() * actionsNumber)) {
            case 0:
                return play();
            case 1:
                return meow();
            case 2:
                return sleep();
            case 3:
                return chaseMouse();
            case 4:
                return walk();
            default:
                System.out.println("Secret activity");
                return true;
        }
    }

    private boolean doNotAct() {
        return false;
    }

    private boolean act(String description, int satietyConsumption) {
        System.out.println(description);
        satiety -= satietyConsumption;
        return true;
    }

    private boolean isHungry() {
        return satiety <= 0;
    }

    public void setKotik(String name, String meow, int weight, int prettiness) {
        this.name = name;
        this.meow = meow;
        this.weight = weight;
        this.prettiness = prettiness;

    }

    public boolean play() {
        final int cost = 5;

        if (isHungry()) {
            return doNotAct();
        }
        return act("Playing", cost);
    }

    private boolean sleep() {
        final int cost = 2;

        if (isHungry()) {
            return doNotAct();
        }
        return act("Sleeping", cost);
    }

   private boolean meow() {
        final int cost = 1;

        if (isHungry()) {
            return doNotAct();
        }
        return act(meow, cost);
    }

    private boolean chaseMouse() {
        final int cost = 7;

        if (isHungry()) {
            return doNotAct();
        }
        return act("Chasing mouse", cost);
    }

    private boolean walk() {
        final int cost = 10;

        if (isHungry()) {
            return doNotAct();
        }
        return act("Walking...", cost);
    }

    public void eat() {
        final int defaultMealCount = 5;
        final String defaultMeal = "default";

        eat(defaultMeal, defaultMealCount);
    }

    public void eat(int mealCount) {
        satiety += mealCount;
        System.out.println("Eating with custom count");
    }

    public void eat(String meal, int mealCount) {
        satiety += mealCount;
        System.out.println("Eating " + meal);
    }

    public String getName() {
        return name;
    }

    public String getMeow() {
        return meow;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrettiness() {
        return prettiness;
    }
}