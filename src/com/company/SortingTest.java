package com.company;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortingTest {
    @Test
    void sort(){
        int[]arr={5,7,2,19,2,39,10};
        int []sortedArr=arr.clone();
        Arrays.sort(sortedArr);
        HeapSort heapSort=new HeapSort();
        int[]heapSortArr=heapSort.sort(arr);
        assertArrayEquals(sortedArr,heapSortArr);
    }
}