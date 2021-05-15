package SortingAlgorithms;

import java.util.Arrays;

public class HeapSort {
    public  int[] sort(int[]arr){
        int currentIndex=0;
        for(int i=0;i<arr.length;i++){
            heap(arr,arr[i],currentIndex++);
        }
        return heapify(arr);
    }
    private static void swapTwoNums(int[]arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    private static void swap(int[]heap,int currentIndex){
        if(currentIndex<=0)return;
        else {
            int child = heap[currentIndex];
            int parentIndex = (int) Math.ceil((float)currentIndex / 2) - 1;
            if (heap[parentIndex] > child) {
              swapTwoNums(heap,parentIndex,currentIndex);
            }
            swap(heap,parentIndex);
        }
    }
    private static void heap(int[]heap,int num,int currentIndex){
        heap[currentIndex]=num;
        swap(heap, currentIndex);

    }
    private static void reheapify(int[]heap,int parentIndex,int heapSize){
        if((parentIndex * 2) + 1>=heapSize)return;
        else {
            int child1 = (parentIndex * 2) + 1;
            int child2 = (parentIndex * 2) + 2;
            int parent;
            if(child2>=heapSize){
                if(heap[parentIndex]>heap[child1]){
                    swapTwoNums(heap, child1, parentIndex);
                    parent = child1;
                }
                else return;
            }
            else if(heap[child1] < heap[child2]){
                swapTwoNums(heap, child1, parentIndex);
                parent=child1;
            }
            else {
                swapTwoNums(heap, child2, parentIndex);
                parent=child2;
            }
            reheapify(heap,parent,heapSize);
        }
    }
    private static int[] heapify(int[]heap){
        int[]sortedArr=new int[heap.length];
                int index=0;
        for(int i=heap.length-1;i>=0;i--){
            int size=i+1;
            sortedArr[index++]=heap[0];
//            System.out.println(heap[leaf]);
            swapTwoNums(heap,0,i);
            size--;
            reheapify(heap,0,size);
        }
       return sortedArr;
//        int leaf=heap.length-1;
//


//        swapTwoNums(heap,leaf,0);
//        reheapify(heap,3,leaf);


    }

//    public static void main(String[] args) {
////        int[]heap={19,193,1,9,-2,0,0};
////        HeapSort heapSort=new HeapSort();
////        heap=heapSort.sort(heap);
//
////        int currentIndex=0;
////        for(int i=0;i<heap.length;i++){
////            heap(heap,heap[i],currentIndex++);
////        }
////        heapify(heap);
////        System.out.println(Arrays.toString(heap));
//
////        heap(heap,26,currentIndex++);
////        heap(heap,5,currentIndex++);
////        heap(heap,77,currentIndex++);
////        heap(heap,1,currentIndex++);
////        heap(heap,61,currentIndex++);
////        heap(heap,11,currentIndex++);
////        heap(heap,59,currentIndex++);
//
//
//
////        addNumber(heap,1,currentIndex++);
//
//    }

}
