package src.test;
import org.junit.Test;

import src.main.SortInteger;

import static org.junit.Assert.*;

public class SortIntegerTest {
    @Test
    public void testSort() {
        int[] input = {5,3,1,6,8,29};
        int[] expected = {1, 3, 5, 6, 8, 29};

        SortInteger.sort(input);

        assertArrayEquals(expected, input);
    }
}
