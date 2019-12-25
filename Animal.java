package ru.geekbrains.DZ6;
import java.util.Random;
public class Animal {
    static final String FAIL = "не смог";
    static final String SUCCESS = "смог";
    static final String UNABLE = "не умеет";

    private String name;
    private String typeAnimal;
    private int maxDistanceRun;
    private int maxDistanceSwim;
    private float maxHeightJump;
    private final Random rnd = new Random();

    public Animal(){
    }

    Animal(String typeAnimal, String name, float maxHeightJump, int maxDistanceRun, int maxDistanceSwim) {
        float jumpVariance = rnd.nextFloat() * 5 - 1;
        int runVariance = rnd.nextInt() * 100 - 500;
        int swimVariance = rnd.nextInt() * 4 - 2;

        this.typeAnimal = typeAnimal;
        this.name = name;
        this.maxHeightJump = maxHeightJump + jumpVariance;
        this.maxDistanceRun = maxDistanceRun + runVariance;
        this.maxDistanceSwim = maxDistanceSwim + swimVariance;
    }
    String getName(){
        return this.name;
    }

    String getTypeAnimal() {
        return this.typeAnimal;
    }

    float getMaxDistanceRun() {
        return this.maxDistanceRun;
    }

    float getMaxDistanceSwim() {
        return this.maxDistanceSwim;
    }

    float getMaxHeightJump() {
        return this.maxHeightJump;
    }

    public Animal(String name){
        this.name = name;
    }
    protected void info() {
        System.out.println("animal: " + name);
    }

    protected String run(int distance) {
        if (maxDistanceRun < 0) return UNABLE;
        return (distance < maxDistanceRun) ? SUCCESS : FAIL;
    }

    protected String swim(int distance) {
        if (maxDistanceSwim < 0) return UNABLE;
        return (distance < maxDistanceSwim) ? SUCCESS : FAIL;
    }

    protected String jump(float height) {
        if (maxHeightJump < 0) return UNABLE;
        return (height < maxHeightJump) ? SUCCESS : FAIL;
    }
}
