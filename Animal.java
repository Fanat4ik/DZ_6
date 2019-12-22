package ru.geekbrains.DZ6;

public class Animal {
    protected String name;

    public Animal(){
    }
    public Animal(String name){
        this.name = name;
    }
    protected void info() {
        System.out.println("animal: " + name);
    }

    protected void run(int distance) {
        System.out.println("animal ran " + distance + " meters");
    }

    protected void swim(int distance) {
        System.out.println("animal swum " + distance + " meters");
    }

    protected void jump(float height) {
        System.out.println("animal jumped " + height + " meters in height");
    }

}
