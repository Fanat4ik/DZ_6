package ru.geekbrains.DZ6;

public class Dog extends Animal{
    protected String name;

    public Dog(){
    }
    public Dog(String name, float maxHeightJump, int maxDistanceRun, int maxDistanceSwim){
        super("Собака", name, maxHeightJump, maxDistanceRun, maxDistanceSwim);
    }
}
