import java.util.Arrays;

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
    public static void main(String[]args){
        int[]arr={7,2,1,6,5};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
