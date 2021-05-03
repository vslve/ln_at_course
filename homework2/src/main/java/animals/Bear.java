package animals;

public class Bear extends Carnivorous implements Swim, Run, Voice {
    @Override
    public void run() {
        System.out.println("Bear running");
    }

    @Override
    public void swim() {
        System.out.println("Bear swimming");
    }

    @Override
    public String voice() {
        return "Bear voice";
    }
}
