import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik = new Kotik("Kotik", "Kotik meow", 2, 10);
        Kotik otherKotik = new Kotik();
        otherKotik.setKotik("OtherKotik", "OtherKotil meow", 5, 10);

        kotik.liveAnotherDay();

        System.out.println();
        System.out.println("Name: " + kotik.getName());
        System.out.println("Weight: " + kotik.getWeight());
        System.out.println(
                kotik.getName() + " and " + otherKotik.getName() + " have the same \"meow\": " +
                kotik.getMeow().equals(otherKotik.getMeow())
        );
        System.out.println(Kotik.class.getSimpleName() + " class instances count: " + Kotik.instanceNumber);
    }
}