package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
    static void swap(int[]arr,int i,int left){
        int temp=arr[i];
        arr[i]=arr[left];
        arr[left]=temp;
    }
    static void sort(int[]arr){

        for(int i=1;i<arr.length;i++){
            int left=i-1;
            int current=i;
            while(left>=0 && arr[current]<arr[left]){
                swap(arr,current,left);
                current--;
                left--;
            }
        }
    }
//    public static void main(String[]args){
//        int[]arr={-50,20,-89,2124,-5392};
//        sort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
}
