package ru.geekbrains.DZ6;

public class Cat extends Animal {
    protected String name;

    public Cat(){
    }
    public Cat(String name, float maxHeightJump, int maxDistanceRun, int maxDistanceSwim){
        super("Кот", name, maxHeightJump, maxDistanceRun, maxDistanceSwim);
    }
}






