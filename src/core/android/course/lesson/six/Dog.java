package core.android.course.lesson.six;

public class Dog extends Animal{
    private static int count = 0;
    int RUNLIMIT = 500;
    int SWIMLIMIT = 10;

    public Dog(String name) {
        super(name);
        this.count++;
    }

    public static int getCount() {
        return count;
    }

    public void run(int distance) {
        if (distance > RUNLIMIT) {
            System.out.printf("A dog can't run more than %d meters\n", RUNLIMIT);
            return;
        }
        super.run(distance);
    }

    public void swim(int distance) {
        if (distance > RUNLIMIT) {
            System.out.printf("A dog can't swim more than %d meters\n", SWIMLIMIT);
            return;
        }
        super.swim(distance);
    }
}
