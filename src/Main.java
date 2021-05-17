import ArrayGenerator.RandomGenerator;
import SortingDurations.InsertionSort;
import SortingDurations.SelectionSort;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        int[]size={10,100,1000,10000,100000};
        for(int i=0;i<size.length;i++){
            int n=size[i];
            RandomGenerator generateArray=new RandomGenerator();
            int []generatedArr=generateArray.generateArray(n);
            double duration= SelectionSort.getDuration(generatedArr);
            System.out.println("Selection Sort used with  "+"Array size "+n+" took "+duration+" seconds");
            duration= InsertionSort.getDuration(generatedArr);
            System.out.println("Insertion Sort used with  "+"Array size "+n+" took "+duration+" seconds");
            System.out.println("***********************************************************");
        }



//        long start = Calendar.getInstance().getTimeInMillis();
//        long end = Calendar.getInstance().getTimeInMillis();
//        System.out.println(end);
//        System.out.println(start);
//        System.out.println( (end-start)/1000.0);
//        RandomGenerator generateArr=new RandomGenerator();
//        int[]arr=generateArr.generateArray(100);
//        System.out.println(Arrays.toString(arr));
    }
}
