import static org.junit.Assert.*;
import org.junit.*;

import java.util.Arrays;
import java.util.List;


public class ListTests {

    @Test
    public void testFilter() {
        List<String> testList = Arrays.asList("apple", "banana");
        StringChecker sc = s -> s.startsWith("a");

        List<String> expected = Arrays.asList("apple");
        List<String> actual = ListExamples.filter(testList, sc);

        assertEquals(expected, actual);
    }

    @Test
    public void testMerge() {
        List<String> list1 = Arrays.asList("a", "c");
        List<String> list2 = Arrays.asList("b", "d");

        List<String> expected = Arrays.asList("a", "b", "c", "d");
        List<String> actual = ListExamples.merge(list1, list2);

        assertEquals(expected, actual);
    }
}
