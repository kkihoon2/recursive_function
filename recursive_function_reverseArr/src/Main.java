import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] output = reverseArr(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(output)); // --> [3, 2, 1]
    }
    public static int[] reverseArr(int[] arr){
        // TODO:배열을 입력받아 순서가 뒤집힌 배열을 리턴해야 합니다.
        // 1. 마지막 요소를 선택
        // 2. 마지막 요소를 제외한 요소를 가진 배열 (tail)
        // 3. tail 배열을 전달 인자로 , 재귀함수를 실행
        // 4. 마지막 요소가 담긴 배열 head와 재귀함수의 반환값이 담긴 배열 tail의 요소를 합친 배열을 반환
        if(arr.length==0)
            return new int[]{};

        int[] head = Arrays.copyOfRange(arr,arr.length-1,arr.length);

        int[] tail = reverseArr(Arrays.copyOfRange(arr,0,arr.length-1));
        int[] dest = new int[head.length+tail.length];

        System.arraycopy(head,0,dest,0,head.length);
        System.arraycopy(tail,0,dest,head.length,tail.length);

        return dest;





//        if(arr.length==0||arr.length==1)
//            return arr;
//        int temp = 0 ;
//        int n = arr.length;
//        temp=arr[0];
//        arr[0]=arr[n-1];
//        arr[n-1]=temp;
//        int []newArr = (Arrays.copyOfRange(arr,1,arr.length-1));
//        return reverseArr(arr);
//        //return reverseArr(IntStream.rangeClosed(1,arr.length-1).toArray());
//        //return reverseArr(Arrays.copyOfRange(arr,1,arr.length-1));
    }
}