package animals;

public class Crocodile extends Carnivorous implements Run, Swim, Voice {
    @Override
    public void run() {
        System.out.println("Crocodile running");
    }

    @Override
    public void swim() {
        System.out.println("Crocodile swimming");
    }

    @Override
    public String voice() {
        return "Crocodile voice";
    }
}
