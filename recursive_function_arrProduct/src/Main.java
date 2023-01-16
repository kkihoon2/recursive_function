import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int output = arrProduct(new int[]{1, -2, 1, 3});
        System.out.println(output); // --> -6
    }
    public static int arrProduct(int[] arr){
        // TODO:배열을 입력받아 모든 요소의 곱을 리턴해야 합니다.
        if(arr.length==0)
            return 1;
        int head = arr[0];
        int[] tail = Arrays.copyOfRange(arr,1,arr.length);
        return head * arrProduct(tail);
    }
}