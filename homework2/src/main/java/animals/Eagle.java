package animals;

public class Eagle extends Carnivorous implements Fly, Voice, Run, Swim {
    @Override
    public void fly() {
        System.out.println("Eagle flying");
    }

    @Override
    public void run() {
        System.out.println("Eagle running");
    }

    @Override
    public void swim() {
        System.out.println("Eagle swimming");
    }

    @Override
    public String voice() {
        return "Eagle voice";
    }
}
