import ArrayGenerator.RandomGenerator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        RandomGenerator generateArr=new RandomGenerator();
        int[]arr=generateArr.generateArray(100);
        System.out.println(Arrays.toString(arr));
    }
}
