package SortingDurations;

import java.util.Calendar;

public class InsertionSort {
    public static double getDuration(int[]arr){
        SortingAlgorithms.InsertionSort insertionSort=new SortingAlgorithms.InsertionSort();
        long start = Calendar.getInstance().getTimeInMillis();
        insertionSort.sort(arr);
        long end = Calendar.getInstance().getTimeInMillis();
        return (end-start)/1000.0;
    }
}
