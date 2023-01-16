import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        boolean output = and(new boolean[]{true, true, true});
        System.out.println(output); // --> true

        output = and(new boolean[]{true, true, false});
        System.out.println(output); // --> false
    }
    public static boolean and(boolean[] arr){
        // TODO:배열을 입력받아 모든 요소의 논리곱(and)을 리턴해야 합니다.
        if(arr.length==0)
            return true;
        boolean head =arr[0];
        boolean[] tail = Arrays.copyOfRange(arr,1,arr.length);
        if(head==true)
            return and(tail);
        else return false;
    }
}