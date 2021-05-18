package SortingDurations;

import java.util.Arrays;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class InsertionSort {
    public static double getDuration(int[]arr){
        SortingAlgorithms.InsertionSort insertionSort=new SortingAlgorithms.InsertionSort();
        long start = Calendar.getInstance().getTimeInMillis();
        insertionSort.sort(arr);
        long end = Calendar.getInstance().getTimeInMillis();
        return (end-start);
    }
}
