package Tests;

import ArrayGenerator.RandomGenerator;
import SortingAlgorithms.HeapSort;
import SortingAlgorithms.InsertionSort;
import SortingAlgorithms.QuckSort;
import SortingAlgorithms.SelectionSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Test_1000 {
    private int size=1000;
    @Test
    void heapSort(){
        RandomGenerator arrayGenerator=new RandomGenerator();
        int[]arr= arrayGenerator.generateArray(size);
        int[]expectedArr=arr.clone();
        Arrays.sort(expectedArr);
        int[]unsortedArr=arr.clone();
        HeapSort heapSort=new HeapSort();
        heapSort.heap(arr);
    }
    @Test
    void quickSort(){
        RandomGenerator arrayGenerator=new RandomGenerator();
        int[]arr= arrayGenerator.generateArray(size);
        int[]expectedArr=arr.clone();
        Arrays.sort(expectedArr);
        int[]unsortedArr=arr.clone();
        QuckSort quickSort=new QuckSort();
        quickSort.quickSort(arr,0,arr.length-1);
    }
    @Test
    void selectionSort(){
        RandomGenerator arrayGenerator=new RandomGenerator();
        int[]arr= arrayGenerator.generateArray(size);
        int[]expectedArr=arr.clone();
        Arrays.sort(expectedArr);
        SelectionSort selectionSort=new SelectionSort();
        selectionSort.selectionSort(arr);
        assertArrayEquals(expectedArr,arr);
    }
    @Test
    void InsertionSort(){
        RandomGenerator arrayGenerator=new RandomGenerator();
        int[]arr= arrayGenerator.generateArray(size);
        int[]expectedArr=arr.clone();
        Arrays.sort(expectedArr);
        InsertionSort insertionSort=new InsertionSort();
        insertionSort.sort(arr);
        assertArrayEquals(expectedArr,arr);
    }

}
