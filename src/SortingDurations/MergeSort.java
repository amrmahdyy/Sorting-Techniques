package SortingDurations;

import java.util.Calendar;

public class MergeSort {
    public static double getDuration(int[]arr){
        SortingAlgorithms.MergeSort mergeSort=new SortingAlgorithms.MergeSort();
        long start = Calendar.getInstance().getTimeInMillis();
        mergeSort.sort(arr,0,arr.length-1);
        long end = Calendar.getInstance().getTimeInMillis();
        return (end-start)/1000.0;
    }
}
