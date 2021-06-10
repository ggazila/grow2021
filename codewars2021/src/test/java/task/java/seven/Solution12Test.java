package task.java.seven;

import org.junit.Assert;
import org.junit.Test;

public class Solution12Test {

    @Test
    public void exampleTest() {
        Assert.assertArrayEquals(new int[]{}, Kata12.flattenAndSort(new int[][]{}));
        Assert.assertArrayEquals(new int[]{1}, Kata12.flattenAndSort(new int[][]{{}, {1}}));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},
				Kata12.flattenAndSort(new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}}));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 100},
				Kata12.flattenAndSort(new int[][]{{1, 3, 5}, {100}, {2, 4, 6}}));
        Assert.assertArrayEquals(new int[]{111, 222, 333, 444, 555, 666, 777, 888, 999},
				Kata12.flattenAndSort(new int[][]{{111, 999}, {222}, {333}, {444}, {888}, {777},
						{666}, {555}}));
    }
}
