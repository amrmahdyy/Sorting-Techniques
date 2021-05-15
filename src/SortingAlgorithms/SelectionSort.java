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
    public static void selectionSort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min])min=j;
            }
            swap(arr,i,min);
        }
        System.out.println(Arrays.toString(arr));
    }
//    public static void main(String[]args){
//        RandomGenerator randomArr=new RandomGenerator();
//        int[]arr=randomArr.generateArray(10000);
//        Date date_1=new Date();
//        long startDate=date_1.getTime();
//        selectionSort(arr);
//        Date date_2=new Date();
//        long endDate=date_2.getTime();
//        System.out.println((endDate-startDate)/1000.0);
//    }
}
