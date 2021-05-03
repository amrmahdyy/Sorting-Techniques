import java.util.Arrays;

public class QuckSort {
    static void swap(int[]arr,int i,int pIndex){
        int a=arr[i];
        arr[i]=arr[pIndex];
        arr[pIndex]=a;
    }
    public static int partition(int[]arr,int start,int end){
        int pivot=arr[end];
        int startPivot=0;
        for(int i=start;i<end;i++){
            if(arr[i]<=pivot){
               swap(arr,i,startPivot);
               startPivot++;
            }
        }
        swap(arr,startPivot,end);
       return startPivot;
    }

    public static void main(String[]args){
        int[]arr={7,2,1,6,8,5,3,4};
        System.out.println(arr[partition(arr,0,arr.length-1)]);
    }
}
