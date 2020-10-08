package ru.geekbrains.lesson_7.core;

public class Plate {
    private String plateName;
    private int food;
    private boolean hungerRemoved;

    public Plate(String plateName, int food){
        this.plateName = plateName;
        this.food = food;
    }

    public void info(){
        System.out.println(plateName+ ": " + food + " food left");
    }

    void decreaseFood(int appetite){
        if (food - appetite < 0) {
            hungerRemoved = false;
            System.out.println("There is not enough food in the plate");
        } else {
            hungerRemoved = true;
            food -= appetite;
        }
    }

    public void addFood(int val){
        System.out.println("Food added to the plate");
        food = food + val;
    }

    boolean isHungerRemoved() {
        return hungerRemoved;
    }

    @Override
    public String toString() {
        return plateName + " with " + food + " food";
    }
}
