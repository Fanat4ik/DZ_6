package ru.geekbrains.DZ6;


public class Main {
    public static void main(String[]args){

        Animal[] arrAnimals = {new Cat("Barsik", 2f, 200, 0),
                new Dog("Chapa", 0.5f, 500, 10)};

        float toJump = 1.5f;
        int toRun = 350;
        int toSwim = 5;

        for (int i = 0; i < arrAnimals.length; i++) {
            String nameFull = arrAnimals[i].getTypeAnimal() + " " + arrAnimals[i].getName();

            String eventResultJump = (arrAnimals[i].jump(toJump).toString());
            System.out.print(nameFull + " " + eventResultJump + " jump. ");
            System.out.println("(Необходимо было jump " + toJump + " метров).");

            String eventResultRun = (arrAnimals[i].run(toRun).toString());
            System.out.print(nameFull + " " + eventResultRun + " run. ");
            System.out.println("(Необходимо было run " + toRun + " метров).");

            String eventResultSwim = (arrAnimals[i].swim(toSwim).toString());
            System.out.print(nameFull + " " + eventResultSwim + " swim. ");
            System.out.println("(Необходимо было swim " + toSwim + " метров).");

        }
    }
}

