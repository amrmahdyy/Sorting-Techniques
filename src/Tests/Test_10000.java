package Tests;
import ArrayGenerator.RandomGenerator;
import SortingAlgorithms.HeapSort;
import SortingAlgorithms.QuckSort;
import SortingAlgorithms.SelectionSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
public class Test_10000 {
    @Test
    void sort(){
        RandomGenerator arrayGenerator=new RandomGenerator();
        int[]arr= arrayGenerator.generateArray(10000);
        int []sortedArr=arr.clone();
        Arrays.sort(sortedArr);
        System.out.println(Arrays.toString(sortedArr));
        HeapSort heapSort=new HeapSort();
        int[]sortedHeapArr=heapSort.sort(arr);
        QuckSort.quickSort(arr,0,arr.length-1);
        int[]sortedQuickSort=arr;
        System.out.println(Arrays.toString(sortedHeapArr));
        assertArrayEquals(sortedArr,sortedQuickSort);
    }
}
