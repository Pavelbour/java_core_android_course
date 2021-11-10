package core.android.course.lesson.six;

public class Animal {
    private static int count = 0;
    String name;

    public Animal(String name) {
        this.name = name;
        this.count++;
    }

    public static int getCount() {
        return count;
    }

    protected void run(int distence) {
        System.out.printf("%s have run %d meters\n", this.name, distence);
    }

    protected void swim(int distance) {
        System.out.printf("%s have swam %d meters\n", this.name, distance);
    }
}
