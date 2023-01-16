import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int output = arrSum(new int[]{-1, -2, 1, 3});
        System.out.println(output); // --> 1
    }
    public static int arrSum(int[] arr){
        //TODO..배열을 입력받아 모든 요소의 합을 리턴해야 합니다.
        if(arr.length==0)
            return 0;
        int head = arr[0];
        int[] tail = Arrays.copyOfRange(arr, 1, arr.length);
        return head+arrSum(tail);
    }
}