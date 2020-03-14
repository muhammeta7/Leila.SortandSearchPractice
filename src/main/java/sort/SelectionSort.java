package sort;

public class SelectionSort<T extends Comparable<T>> implements Sort<T>{
    public T[] sort(T[] array) {
        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i].compareTo(array[j]) > 0){
                    swap(j,i, array);
                }
            }
        }
        return array;
    }


    public void swap(int a, int b, T[] array){
        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }


}
