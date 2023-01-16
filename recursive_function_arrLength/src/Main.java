import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int output = arrLength(new int[]{1, -2, 1, 3});
        System.out.println(output); // --> 4
    }
    public static int arrLength(int[] arr)
    {
        // TODO:배열을 입력받아 그 길이를 리턴해야 합니다.
        if(arr.length==0)
            return 0;

        int[] tail = Arrays.copyOfRange(arr,1,arr.length);
        return 1+arrLength(tail);
    }
}