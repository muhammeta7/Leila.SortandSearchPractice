package search;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void testInt0() {
        BinarySearch<Integer> bs = new BinarySearch<>();
        Integer[] array= {0,1,2,3,4,5,6,7};
        int wantToFind = 2;
        Assert.assertEquals(2, bs.search(wantToFind,array));
    }

    @Test
    public void testInt1() {
        BinarySearch<Integer> bs = new BinarySearch<>();
        Integer[] array= {3,5,6,7,9,11};
        int wantToFind = 11;
        Assert.assertEquals(5, bs.search(wantToFind,array));
    }


    @Test
    public void testInt2() {
        BinarySearch<Integer> bs = new BinarySearch<>();
        Integer[] array= {1};
        int wantToFind = 1;
        Assert.assertEquals(0, bs.search(wantToFind,array));
    }


    @Test
    public void testInt3() {
        BinarySearch<Integer> bs = new BinarySearch<>();
        Integer[] array = {-80, -30, -10, 15};
        int wantToFind = -10;
        Assert.assertEquals(2, bs.search(wantToFind, array));
    }


    @Test
    public void testInt4() {
        BinarySearch<Integer> bs = new BinarySearch<>();
        Integer[] array = {1,2,3,5,6,6,6,7};
        int wantToFind = 4;
        Assert.assertEquals(-1, bs.search(wantToFind, array));
    }


    @Test
    public void testInt4_2() {
        BinarySearch<Integer> bs = new BinarySearch<>();
        Integer[] array = {2,3,3,5,6,6,6,7};
        int wantToFind = 1;
        Assert.assertEquals(-1, bs.search(wantToFind, array));
    }


    @Test
    public void testString0() {
        BinarySearch<String> bs = new BinarySearch<>();
        String[] array = {"apple","banana","coconut","dragon fruit"};
        String wantToFind = "banana";
        Assert.assertEquals(1, bs.search(wantToFind, array));
    }

}
