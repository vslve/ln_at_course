import animals.Animal;
import aviary.Aviary;

import java.util.List;


public class AviaryUtils {
    public static void showAviaryAnimals(Aviary<? extends Animal> aviary) {
            System.out.print("Animals in " + aviary.getSize() + " aviary: ");
            aviary.getAviary().values().forEach(animal -> System.out.print(
                    animal.getClass().getSimpleName() + " "));
            System.out.println();
    }

    public static <T extends Animal> void addAnimalsVerbose(
            Class<T> animalType,
            Aviary<T> aviary,
            Animal[] animals
    ) {
        System.out.println("Aviary size is " + aviary.getSize() + ":\n");
        for (Animal animal : animals) {
            boolean added;
            try {
                    added = aviary.addAnimal(animalType.cast(animal));
                if (added) {
                    System.out.println(
                            "Added: " + animal.getClass().getSimpleName() + ", size " + animal.getAviarySize()
                    );
                } else {
                    System.out.println(
                            "Not added: " + animal.getClass().getSimpleName() + ", size " + animal.getAviarySize()
                    );
                }
            } catch (ClassCastException e) {
                System.out.println("This aviary not for " + animal.getClass().getSimpleName());
            }
        }
    }
    
    public static <T extends Animal> void deleteAnimalsVerbose(
            Class<T> animalType,
            Aviary<T> aviary,
            Animal... animals
    ) {
        System.out.print("Deleted from " + aviary.getSize() + " aviary: ");
        animals = animals.length == 0 ? aviary.getAviary().values().toArray(new Animal[]{}) : animals;
        for (Animal animal : animals) {
            boolean deleted;
            try {
                deleted = aviary.addAnimal(animalType.cast(animal));
                if (deleted) {
                            System.out.print(animal.getClass().getSimpleName() + " ");
                } else {
                    System.out.print("\nthere is no animal in aviary: " + animal.getClass().getSimpleName() + " ");
                }
            } catch (ClassCastException e) {
                System.out.print("\naliens in aviary: " + animal.getClass().getSimpleName());
            }
        }
    }

    public static <T extends Animal> void checkAviary(
            Class<T> animalType,
            List<Aviary<T>> animalsAviary,
            Animal[] animals
    ) {
        for (Aviary<T> aviary : animalsAviary) {
            AviaryUtils.addAnimalsVerbose(animalType, aviary,  animals);
            System.out.println();
        }

        for (Aviary<T> aviary : animalsAviary) {
            AviaryUtils.showAviaryAnimals(aviary);
        }
        System.out.println();

        for (Aviary<T> aviary : animalsAviary) {
            AviaryUtils.deleteAnimalsVerbose(animalType, aviary);
            System.out.println();
        }
        System.out.println();

        for (Aviary<T> aviary : animalsAviary) {
            AviaryUtils.showAviaryAnimals(aviary);
        }
        System.out.println();

        System.out.println("------------DELETING STRANGE ANIMALS----------");
        for (Aviary<T> aviary : animalsAviary) {
            AviaryUtils.deleteAnimalsVerbose(animalType, aviary, animals);
            System.out.println();
        }
        System.out.println("----------------------------------------------");
    }
}
