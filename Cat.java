package ru.geekbrains.DZ6;


public class Cat extends Animal {
    protected String name;


    public Cat(){
    }
    public Cat(String name){
        this.name = name;
    }

    protected void run(int distance){
        if (distance > 200 || distance < 0){
            System.out.println("cat run : false");
        }else {
            System.out.println("cat ran " + distance + " meters");
        }
    }
    protected void swim(int distance) {
        System.out.println("cat swim : false");
    }
    protected void jump(float height) {
        if (height > 2 || height < 0){
            System.out.println("cat jump : false");
        }else {
            System.out.println("cat jumped " + height + " meters in height");
        }
    }


}






