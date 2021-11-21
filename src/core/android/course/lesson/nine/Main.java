package core.android.course.lesson.nine;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        String[][] dataArray1 = new String[4][4];
        String[][] dataArray2 = new String[4][4];
        String[][] dataArray3 = new String[5][3];

        for (int i = 0; i < dataArray1.length; i++) {
            for (int j = 0; j < dataArray1[i].length; j++) {
                dataArray1[i][j] = String.valueOf(random.nextInt(101));
            }
        }

        for (int i = 0; i < dataArray2.length; i++) {
            for (int j = 0; j < dataArray2[i].length; j++) {
                dataArray2[i][j] = String.valueOf(random.nextInt(101));
            }
        }
        dataArray2[1][1]="qeqwrewtret";

        for (int i = 0; i <dataArray3.length; i++) {
            for (int j = 0; j < dataArray3[i].length; j++) {
                dataArray3[i][j] = String.valueOf(random.nextInt(101));
            }
        }

        try {
            System.out.printf("Sum: %d\n", arraySum(dataArray1));
        } catch (MyArraySizeException e) {
            System.out.println("The size of the array is incorrect. It should be 4.");
        } catch (MyArrayDataException e) {
            System.out.println("The data in array is incorrect. It should be a number.");
        }

        try {
            System.out.printf("Sum: %d\n", arraySum(dataArray2));
        } catch (MyArraySizeException e) {
            System.out.println("The size of the array is incorrect. It should be 4.");
        } catch (MyArrayDataException e) {
            System.out.println("The data in array is incorrect. It should be a number.");
        }

        try {
            System.out.printf("Sum: %d\n", arraySum(dataArray3));
        } catch (MyArraySizeException e) {
            System.out.println("The size of the array is incorrect. It should be 4.");
        } catch (MyArrayDataException e) {
            System.out.println("The data in array is incorrect. It should be a number.");
        }
    }

    public static int arraySum(String[][] dataArray) throws MyArraySizeException, MyArrayDataException {
        if (dataArray.length != 4) {
            throw new MyArraySizeException("The sizes of array are incorrect");
        }

        int sum = 0;

        for (String[] dataRow: dataArray) {
            if (dataRow.length != 4) {
                throw new MyArraySizeException("The sizes of array are incorrect");
            }

            for (String dataString: dataRow) {
                try {
                    sum += Integer.parseInt(dataString);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("The format of string is incorrect. It should be an integer.");
                }
            }
        }

        return sum;
    }
}
