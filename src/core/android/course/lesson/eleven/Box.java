package core.android.course.lesson.eleven;

import java.util.ArrayList;
import java.util.HashMap;

public class Box<T extends Fruit> {
    private final String className;
    private final ArrayList<T> fruits;
    private final HashMap<String, Float> weightData;


    public Box(T obj) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        this.fruits = new ArrayList<T>();
        weightData = new HashMap<>();
        weightData.put(apple.getClass().getName(), 1.0f);
        weightData.put(orange.getClass().getName(), 1.5f);
        this.className = obj.getClass().getName();
    }

    public void addFruit(T fruit) {
        this.fruits.add(fruit);
    }

    public float getWeight() {
        return weightData.get(this.className) * fruits.size();
    }

    public boolean compare(Box boxToCompare) {
        return this.getWeight() == boxToCompare.getWeight();
    }

    public void transferFruits(Box<T> destinationBox) {
        for (T fruit: this.fruits) {
            destinationBox.addFruit(fruit);
        }

        this.fruits.clear();
    }

    public void printBox() {
        System.out.println("====================================");
        System.out.println(this.getClass().getName());
        System.out.println("====================================");
        System.out.printf("This box contains %d %s.\n", fruits.size(), this.className);
        System.out.printf("This box weights %f.\n", this.getWeight());
    }
}
