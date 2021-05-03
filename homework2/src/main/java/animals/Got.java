package animals;

public class Got extends Herbivore implements Run, Voice, Swim {
    @Override
    public void run() {
        System.out.println("Got running");
    }

    @Override
    public void swim() {
        System.out.println("Got swimming");
    }

    @Override
    public String voice() {
        return "Got voice";
    }
}
