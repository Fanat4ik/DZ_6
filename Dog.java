package ru.geekbrains.DZ6;

public class Dog extends Animal{
    protected String name;

    public Dog(){
    }
    public Dog(String name){
        this.name = name;
    }

    protected void run(int distance){
        if (distance > 500 || distance < 0){
            System.out.println("dog run : false");
        }else {
            System.out.println("dog ran " + distance + " meters");
        }
    }
    protected void swim(int distance){
        if (distance > 10 || distance < 0){
            System.out.println("dog swim : false");
        }else {
            System.out.println("dog swum " + distance + " meters");
        }
    }
    protected void jump(float height) {
        if (height > 0.5 || height < 0){
            System.out.println("dog jump : false");
        }else {
            System.out.println("dog jumped " + height + " meters in height");
        }
    }

}
