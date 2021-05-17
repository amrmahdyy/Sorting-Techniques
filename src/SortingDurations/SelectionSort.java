package SortingDurations;

import java.util.Calendar;

public class SelectionSort {
    public static double getDuration(int[]arr){
        SortingAlgorithms.SelectionSort selectionSort=new SortingAlgorithms.SelectionSort();
        long start = Calendar.getInstance().getTimeInMillis();
        selectionSort.selectionSort(arr);
        long end = Calendar.getInstance().getTimeInMillis();
        return (end-start)/1000.0;
    }
}
