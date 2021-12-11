package core.android.course.lesson.fourteen;

public class NumTest {
    public static boolean testArray(int[] dataArray) {
        boolean is1exist = false;
        boolean is4exist = false;
        boolean isOtherNumber = false;

        for (int number: dataArray) {
            if (number == 1) {
                is1exist = true;
            } else if (number == 4) {
                is4exist = true;
            } else {
                isOtherNumber = true;
                break;
            }
        }

        return is1exist && is4exist && !isOtherNumber;
    }
}
