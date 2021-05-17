package Tests;
import ArrayGenerator.RandomGenerator;
import SortingAlgorithms.HeapSort;
import SortingAlgorithms.InsertionSort;
import SortingAlgorithms.QuckSort;
import SortingAlgorithms.SelectionSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
public class Test_10000 {
    private int size=10000;
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
        Date startDate=new Date();
        long startTimeInMs=startDate.getTime();
        heapSort.heap(actualArr);
        Date endDate=new Date();
        long endTimeInMs=endDate.getTime();
        System.out.println("Heap sort duration on array with size "+this.size+" is "+(endTimeInMs-startTimeInMs)/1000.0+" seconds");
        assertArrayEquals(expectedArr,actualArr);
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
        Date startDate=new Date();
        long startTimeInMs=startDate.getTime();
        quickSort.quickSort(actualArr,0,arr.length-1);
        Date endDate=new Date();
        long endTimeInMs=endDate.getTime();
        assertArrayEquals(expectedArr,actualArr);
        System.out.println("quick sort duration on array with size "+this.size+" is "+(endTimeInMs-startTimeInMs)/1000.0+" seconds");
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
        Date startDate=new Date();
        long startTimeInMs=startDate.getTime();
        selectionSort.selectionSort(actualArr);
        Date endDate=new Date();
        long endTimeInMs=endDate.getTime();
        System.out.println("Selection sort duration on array with size "+this.size+" is "+(endTimeInMs-startTimeInMs)/1000.0+" seconds");
        assertArrayEquals(expectedArr,actualArr);
    }
    @Test
    void InsertionSort(){
        int[]expectedArr=this.arr.clone();
        //sort the expected array that was generated
        Arrays.sort(expectedArr);
        // copy the array generated
        int[]actualArr=this.arr.clone();
        InsertionSort insertionSort=new InsertionSort();
        Date startDate=new Date();
        long startTimeInMs=startDate.getTime();
        insertionSort.sort(actualArr);
        Date endDate=new Date();
        long endTimeInMs=endDate.getTime();
        System.out.println("Insertion sort duration on array with size "+this.size+" is "+(endTimeInMs-startTimeInMs)/1000.0+" seconds");
        assertArrayEquals(expectedArr,actualArr);
    }

}
