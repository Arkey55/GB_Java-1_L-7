package ru.geekbrains.lesson_7.core;

public class Cat {
    private String name;
    private int appetite;
    private boolean hunger = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    private void checkHunger(){
        if (hunger){
            System.out.println(name + " is full");
        } else {
            System.out.println(name + " still hungry");
        }
    }

    public void eat(Plate plate){
        System.out.println(name + " eating " + appetite + " food from the " + plate);
        plate.decreaseFood(appetite);
        if (plate.isHungerRemoved()){
            hunger = true;
        }
        checkHunger();
        if (!hunger){
            plate.addFood(100);
            eat(plate);
        }

    }
}
