package com.company;

import java.util.Arrays;

public class HeapSort {
    static void swap(int[]heap,int currentIndex){
        if(currentIndex<=0)return;
        else {
            System.out.println(true);
            int child = heap[currentIndex];
            int parentIndex = (int) Math.ceil((float)currentIndex / 2) - 1;
            if (heap[parentIndex] > child) {
                int temp = heap[currentIndex];
                heap[currentIndex] = heap[parentIndex];
                heap[parentIndex] = temp;
            }
            swap(heap,parentIndex);
        }
    }
    public static void heap(int[]heap,int num,int currentIndex){
        heap[currentIndex]=num;
        swap(heap, currentIndex);

    }

    public static void main(String[] args) {
        int[]heap={26,5,77,1,61,11,59,15,48,19};
        int currentIndex=0;
        for(int i=0;i<heap.length;i++){
            heap(heap,heap[i],currentIndex++);
        }
        System.out.println(Math.ceil((float)3/2)-1);
//        heap(heap,26,currentIndex++);
//        heap(heap,5,currentIndex++);
//        heap(heap,77,currentIndex++);
//        heap(heap,1,currentIndex++);
//        heap(heap,61,currentIndex++);
//        heap(heap,11,currentIndex++);
//        heap(heap,59,currentIndex++);



//        addNumber(heap,1,currentIndex++);
        System.out.println(Arrays.toString(heap));
    }

}
