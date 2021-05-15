package com.company;


public class RandomGenerator {
    public  int[] generateArray(int n){
        int[]arr=new int[n];
        boolean negNumber=false;
        for(int i=0;i<n;i++){
            int randomNumber=(int)(Math.random()*100);
            arr[i]=negNumber?randomNumber*-1:randomNumber;
            negNumber=negNumber?false:true;
        }
        return arr;
    }

}
