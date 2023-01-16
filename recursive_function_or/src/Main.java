import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        boolean output = or(new boolean[]{true, true, false});
        System.out.println(output); // --> true

        output = or(new boolean[]{false, false, false});
        System.out.println(output); // --> false
    }
    public static boolean or(boolean[] arr){
        // TODO:배열을 입력받아 모든 요소의 논리합(or)을 리턴해야 합니다.
        if(arr.length==0)
            return false;
        boolean head =arr[0];
        boolean[] tail = Arrays.copyOfRange(arr,1,arr.length);
        if(head==false)
            return or(tail);
        else return true;
    }
}