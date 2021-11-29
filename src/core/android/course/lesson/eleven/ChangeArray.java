package core.android.course.lesson.eleven;

public class ChangeArray<T> {
    private T[] dataArray;

    public ChangeArray (T[] data) {
        this.dataArray = data;
    }

    public void changeElements(int a, int b) {
        T buffer = dataArray[a];
        dataArray[a] = dataArray[b];
        dataArray[b] = buffer;
    }

    public void printArray() {
        for (T element: this.dataArray) {
            System.out.println(element);
        }
    }
}
