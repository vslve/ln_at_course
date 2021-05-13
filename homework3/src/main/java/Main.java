import animals.*;
import aviary.Aviary;
import aviary.AviarySize;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Animal[] animals = {
                new Duck(AviarySize.LITTLE),
                new Fish(AviarySize.LITTLE),
                new Eagle(AviarySize.AVERAGE),
                new Bear(AviarySize.GIANT),
                new Crocodile(AviarySize.LARGE),
                new Got(AviarySize.AVERAGE)
        };
        final List<Aviary<Carnivorous>> carnivorousAviaries = List.of(
                new Aviary<>(AviarySize.LITTLE),
                new Aviary<>(AviarySize.AVERAGE),
                new Aviary<>(AviarySize.LARGE),
                new Aviary<>(AviarySize.GIANT)
        );
        final  List<Aviary<Herbivore>> herbivoreAviaries = List.of(
                new Aviary<>(AviarySize.LITTLE),
                new Aviary<>(AviarySize.AVERAGE),
                new Aviary<>(AviarySize.LARGE),
                new Aviary<>(AviarySize.GIANT)
        );

        System.out.println("             CARNIVOROUS AVIARY");
        System.out.println("----------------------------------------------");
        AviaryUtils.checkAviary(Carnivorous.class, carnivorousAviaries, animals);
        System.out.println("\n");
        System.out.println("             HERBIVORE AVIARY");
        System.out.println("----------------------------------------------");
        AviaryUtils.checkAviary(Herbivore.class, herbivoreAviaries, animals);
    }
}
