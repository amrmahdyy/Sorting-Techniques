package SortingDurations;

import java.util.Calendar;
import java.util.Date;

public class BubbleSort {
    public static double getDuration(int[]arr){
        SortingAlgorithms.BubbleSort bubbleSort=new SortingAlgorithms.BubbleSort();
        long start = new Date().getTime();
        bubbleSort.bubbleSort(arr);
        long end = new Date().getTime();
        return (end-start);
    }
}
