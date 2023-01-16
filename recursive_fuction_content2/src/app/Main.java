package app;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
    public int arrSum(int[]arr)
    {
        if(arr.length==0)
            return 0;

        int[] tail = Arrays.copyOfRange(arr,1,arr.length);

        return arr[0]+arrSum(tail);
    }
}