package SortingAlgorithms;

import ArrayGenerator.RandomGenerator;

import java.util.Arrays;
import java.util.Date;

public class SelectionSort {
    private static void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public  void selectionSort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min])min=j;
            }
            swap(arr,i,min);
        }
    }

}
