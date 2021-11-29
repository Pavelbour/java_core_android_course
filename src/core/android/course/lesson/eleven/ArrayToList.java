package core.android.course.lesson.eleven;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList<T> {
    private T[] dataArray;
    private ArrayList<T> dataList;

    public ArrayToList(T[] data) {
        this.dataArray = data;
        this.dataList = new ArrayList<>();
    }

    public void arrayToList() {
        for (T element: dataArray) {
            this.dataList.add(element);
        }
    }

    public void printList() {
        System.out.println("====================================");
        System.out.println(this.getClass().getName());
        System.out.println("====================================");
        for (T element: this.dataList) {
            System.out.println(element);
        }
    }
}
