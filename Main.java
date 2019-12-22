package ru.geekbrains.DZ6;


public class Main {
    public static void main(String[]args){
    Cat barsik = new Cat("Barsik");
    barsik.run(100);
    barsik.jump(1f);
    barsik.swim(5);

    Dog chapa = new Dog("Chapa");
    chapa.run(600);
    chapa.jump(-1f);
    chapa.swim(8);
    }
}

//        5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
