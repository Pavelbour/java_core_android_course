import core.android.course.lesson.fourteen.Cut;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayCutTest {

    @Test
    public void testCut() {
        int[] data = {1, 4, 2, 3};
        int[] result = {2, 3};
        Assertions.assertArrayEquals(result, Cut.arrayCut(data) );

        int[] data2 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] result2 = {1, 7};
        Assertions.assertArrayEquals(result2, Cut.arrayCut(data2) );

        int[] data3 = {5, 6, 2, 1, 3, 8, 9};
        Assertions.assertThrows(RuntimeException.class, () -> Cut.arrayCut(data3));
    }
}
