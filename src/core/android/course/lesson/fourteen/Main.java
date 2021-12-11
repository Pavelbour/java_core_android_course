package core.android.course.lesson.fourteen;

public class Main {
    public static void main(String[] args) {

    }

    public static int[] arrayCut(int[] dataArray) throws RuntimeException {
        boolean isArrayValid = false;
        int ind = 0;

        for (int i = 0; i < dataArray.length; i++) {
            if (dataArray[i] == 4) {
                ind = i;
                isArrayValid = true;
            }
        }

        if (!isArrayValid) {
            throw new RuntimeException();
        }
        int[] result = new int[dataArray.length - ind -1];
        System.arraycopy(dataArray, ind + 1, result, 0, dataArray.length - ind -1);

        return result;
    }
}
