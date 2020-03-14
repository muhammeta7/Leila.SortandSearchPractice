package search;

public class BinarySearch<T extends Comparable<T>>{

    //should return the index of the element found
    //return -1 if not found
    int search(T value, T[] array){
        return BS(0,array.length,array,value);
    }

    int BS(int left, int right, T[] arr, T val){
        int mid = (left+right)/2;
        if(left==right){
            return -1;
        }else if(arr[mid].compareTo(val) > 0  ){
            return BS(left+1, mid, arr, val);
        }else if(arr[mid].compareTo(val) < 0 ){
            return BS(mid, right, arr, val);
        }else if(arr[mid].compareTo(val) == 0 )
            return mid;
        return -1;
    }

}
