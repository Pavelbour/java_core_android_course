package core.android.course.lesson.eleven;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {5, 25, 4, 8, 18, 17, 26};
        String[] strArray = {"5", "25", "4", "8", "18", "17", "26"};
        ChangeArray<Integer> arr1 = new ChangeArray<>(intArray);
        ChangeArray<String> arr2 = new ChangeArray<>(strArray);

        arr1.changeElements(4, 5);
        arr2.changeElements(4, 5);

        arr1.printArray();
        arr2.printArray();

        ArrayToList<String> listArr = new ArrayToList<>(strArray);
        listArr.arrayToList();
        listArr.printList();

        Box<Apple> box1 = new Box<>(new Apple());
        Box<Apple> box2 = new Box<>(new Apple());
        Box<Orange> box3 = new Box<>(new Orange());

        for (int i = 0; i < 5; i++) {
            box1.addFruit(new Apple());
        }

        for (int i = 0; i < 3; i++) {
            box2.addFruit(new Apple());
        }

        for (int i = 0; i < 2; i++) {
            box3.addFruit(new Orange());
        }

        box1.printBox();
        box2.printBox();
        box3.printBox();

        if (box2.compare(box3)) {
            System.out.println("The box2 is equal to box3");
        } else {
            System.out.println("The box2 isn't equal to box3");
        }

        if (box1.compare(box3)) {
            System.out.println("The box1 is equal to box3");
        } else {
            System.out.println("The box1 isn't equal to box3");
        }

        box2.transferFruits(box1);

        box1.printBox();
        box2.printBox();
        box3.printBox();
    }
}
