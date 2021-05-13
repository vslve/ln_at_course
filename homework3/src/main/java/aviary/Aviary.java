package aviary;

import animals.Animal;

import java.util.HashMap;
import java.util.Map;

public class Aviary <T extends Animal> {
    private final Map<Integer, T> aviary = new HashMap<>();
    private AviarySize size;

    public Aviary(AviarySize size) {
        this.size = size;
    }

    public AviarySize getSize() {
        return size;
    }

    public void setSize(AviarySize size) {
        this.size = size;
    }

    public Map<Integer, T> getAviary() {
        return aviary;
    }

    public boolean addAnimal(T animal) {
        if (animal.getAviarySize().getSize() <= size.getSize()) {
            aviary.put(animal.getId(), animal);
            return true;
        }
        return false;
    }

    public boolean deleteAnimal(T animal) {
        return aviary.remove(animal.getId(), animal);
    }

    public T getAnimal(int id) {
        return aviary.get(id);
    }
}
