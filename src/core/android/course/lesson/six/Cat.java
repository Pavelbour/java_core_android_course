package core.android.course.lesson.six;

public class Cat extends Animal{
    private static int count = 0;
    int RUNLIMIT = 200;
    int SWIMLIMIT = 0;

    public Cat(String name){
        super(name);
        this.count++;
    }

    public static int getCount() {
        return count;
    }

    public void run(int distance) {
        if (distance > RUNLIMIT) {
            System.out.printf("A cat can't run more than %d meters\n", RUNLIMIT);
            return;
        }
        super.run(distance);
    }

    public void swim(int distance) {
        if (distance > SWIMLIMIT) {
            System.out.printf("A cat can't swim\n", SWIMLIMIT);
            return;
        }
        super.swim(distance);
    }
}
