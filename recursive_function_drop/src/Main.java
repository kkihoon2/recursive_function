import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] output = drop(2, new int[]{1, -2, 1, 3});
        System.out.println(output); // --> [1, 3]

        output = drop(5, new int[]{1, -2, 1, 3});
        System.out.println(output); // --> [ ]
    }
    public static int[] drop(int num, int[] arr){
        // TODO:수(num)와 배열을 입력받아 차례대로 num개의 요소가 제거된 새로운 배열을 리턴해야 합니다.
        if(num ==0||arr.length==0)
            return arr;
        num--;
        return drop(num,Arrays.copyOfRange(arr,1,arr.length));
    }
}