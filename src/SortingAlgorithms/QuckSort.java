package SortingAlgorithms;//import jdk.vm.ci.meta.Local;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

public class QuckSort {

    static void swap(int[]arr,int i,int pIndex){
        int a=arr[i];
        arr[i]=arr[pIndex];
        arr[pIndex]=a;
    }
    public static int partition(int[]arr,int start,int end){
        int pivot=arr[end];
        int startPivot=start;
        for(int i=start;i<end;i++){
            if(arr[i]<=pivot){
               swap(arr,i,startPivot);
               startPivot++;
            }
        }
        swap(arr,startPivot,end);
       return startPivot;
    }
    public static void quickSort(int[]arr,int start,int end){
        if(start<end) {
            int pivotIndex = partition(arr, start, end);
            quickSort(arr, start, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }
    }
//    public static void main(String[]args){
//        int[]arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//        Date start=new Date();
////        LocalDateTime start = LocalDateTime.now();
//        quickSort(arr,0,arr.length-1);
//        Date end=new Date();
//        System.out.println(start.getTime()-end.getTime());
////        LocalDateTime end = LocalDateTime.now();
////        System.out.println(start.get);
//        System.out.println(Arrays.toString(arr));
//    }
}
