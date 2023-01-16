import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] output = take(2, new int[]{1, -2, 1, 3});
        System.out.println(output); // --> [1, -2]

        output = take(5, new int[]{1, -2, 1, 3});
        System.out.println(output); // --> [1, -2, 1, 3]
    }
    public static int[] take(int num, int[] arr){
        // TODO:수(num)와 배열을 입력받아 차례대로 num개의 요소만 포함된 새로운 배열을 리턴해야 합니다.
        if(num==0)
            return new int[]{};
        if(num>arr.length)
            return arr;
        if(num==arr.length)
            return arr;

        return take(num, Arrays.copyOfRange(arr,0,arr.length-1));
    }
}