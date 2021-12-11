import core.android.course.lesson.fourteen.NumTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberTest {

    @Test
    public void numberTest() {
        int[] data1 = {1, 1, 1, 4, 4, 1, 4, 4};
        int[] data2 = {1, 1, 1, 1, 1, 1};
        int[] data3 = {4, 4, 4, 4};
        int[] data4 = {1, 4, 4, 1, 1, 4, 3};

        Assertions.assertEquals(true, NumTest.testArray(data1));
        Assertions.assertEquals(false, NumTest.testArray(data2));
        Assertions.assertEquals(false, NumTest.testArray(data3));
        Assertions.assertEquals(false, NumTest.testArray(data4));
    }

}
