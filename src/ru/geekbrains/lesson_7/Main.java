package ru.geekbrains.lesson_7;

import ru.geekbrains.lesson_7.core.Cat;
import ru.geekbrains.lesson_7.core.Plate;


public class Main {

    public static void main(String[] args) {
        Cat[] cats =   {new Cat("Max", 25),
                        new Cat("Leo", 35),
                        new Cat("Thomas", 20),
                        new Cat("Grubber", 40)
        };
        Plate plate = new Plate("plate 1", 100);
        feedCats(cats,plate);

    }
    private static void feedCats(Cat[] cats, Plate plate){
        for (int i = 0; i < cats.length; i++) {
            plate.info();
            cats[i].eat(plate);
        }
        plate.info();
    }
}
