package Tests;

import ArrayGenerator.RandomGenerator;
import SortingAlgorithms.HeapSort;
import SortingAlgorithms.InsertionSort;
import SortingAlgorithms.QuckSort;
import SortingAlgorithms.SelectionSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Test_10 {
    private int size=10;
    RandomGenerator arrayGenerator=new RandomGenerator();
    int[]arr= arrayGenerator.generateArray(size);
    @Test
    void heapSort(){
        int[]expectedArr=this.arr.clone();
        //sort the expected array that was generated
        Arrays.sort(expectedArr);
        // copy the array generated
        int[]actualArr=this.arr.clone();
        HeapSort heapSort=new HeapSort();

        long start = Calendar.getInstance().getTimeInMillis();
        heapSort.heap(actualArr);
        long end = Calendar.getInstance().getTimeInMillis();
        assertArrayEquals(expectedArr,actualArr);
        System.out.println("Heap sort duration on array with size "+this.size+" is "+(end-start)/1000.0+" seconds");
    }
    @Test
    void quickSort(){
        int[]expectedArr=this.arr.clone();
        //sort the expected array that was generated
        Arrays.sort(expectedArr);
        // copy the array generated
        int[]actualArr=this.arr.clone();
        QuckSort quickSort=new QuckSort();
        // calculate time
        long start = Calendar.getInstance().getTimeInMillis();
        quickSort.quickSort(actualArr,0,arr.length-1);
        long end = Calendar.getInstance().getTimeInMillis();
        assertArrayEquals(expectedArr,actualArr);
        System.out.println("quick sort duration on array with size "+this.size+" is "+(end-start)/1000.0+" seconds");
    }
    @Test
    void selectionSort(){
        int[]expectedArr=this.arr.clone();
        //sort the expected array that was generated
        Arrays.sort(expectedArr);
        // copy the array generated
        int[]actualArr=this.arr.clone();
        SelectionSort selectionSort=new SelectionSort();
        // calculate time

        long start = Calendar.getInstance().getTimeInMillis();
        selectionSort.selectionSort(actualArr);
        long end = Calendar.getInstance().getTimeInMillis();
        assertArrayEquals(expectedArr,actualArr);
        System.out.println("Selection sort duration on array with size "+this.size+" is "+(end-start)/1000.0+" seconds");
    }
    @Test
    void InsertionSort(){
        int[]expectedArr=this.arr.clone();
        //sort the expected array that was generated
        Arrays.sort(expectedArr);
        // copy the array generated
        int[]actualArr=this.arr.clone();
        InsertionSort insertionSort=new InsertionSort();
        long start = Calendar.getInstance().getTimeInMillis();
        insertionSort.sort(actualArr);
        long end = Calendar.getInstance().getTimeInMillis();
        assertArrayEquals(expectedArr,actualArr);
        System.out.println("Insertion sort duration on array with size "+this.size+" is "+(end-start)/1000.0+" seconds");
    }


}
