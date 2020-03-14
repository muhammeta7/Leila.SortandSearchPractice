package sort;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class SortTest {

    Sort<Integer> intSort = new SelectionSort<>();
    Sort<String> stringSort = new SelectionSort<>();

    @Test
    public void testInt0() {
        Integer[] unsorted = {3,5,4,2,1,7,6};
        Integer[] expected= {1,2,3,4,5,6,7};
        test(expected, intSort.sort(unsorted));
    }

    @Test
    public void testInt1() {
        Integer[] unsorted = {2,3,5,4,2,1,7,6,2,2};
        Integer[] expected= {1,2,2,2,2,3,4,5,6,7};
        test(expected, intSort.sort(unsorted));
    }

    @Test
    public void testString0() {
        String[] unsorted = {"Banana","Apple","Orange"};
        String[] expected= {"Apple","Banana","Orange"};
        testString(expected, stringSort.sort(unsorted));
    }

    @Test
    public void testString1() {
        String[] unsorted = {"aa","ab","ac","aa","aa"};
        String[] expected= {"aa","aa","aa","ab","ac",};
        testString(expected, stringSort.sort(unsorted));
    }




    private void test(Integer[] array1, Integer[] array2) {
        List<Integer> intList1 = Arrays.asList(array1);
        List<Integer> intList2 = Arrays.asList(array2);
        for (int i = 0; i < array1.length; i++)
            Assert.assertEquals(intList1.get(i),intList2.get(i));
    }

    private void testString(String[] array1, String[] array2) {
        List<String> intList1 = Arrays.asList(array1);
        List<String> intList2 = Arrays.asList(array2);
        for (int i = 0; i < array1.length; i++)
            Assert.assertEquals(intList1.get(i),intList2.get(i));
    }

}
