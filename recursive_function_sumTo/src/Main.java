public class Main {
    public static void main(String[] args) {
        int output = sumTo(10);
        System.out.println(output);
    }
    public static int sumTo(int num){
        //TODO..수(num)를 입력받아 1부터 num까지의 합을 리턴해야 합니다.
        if(num==0)
            return 0;
        if(num==1)
            return 1;
        return num+sumTo(num-1);

    }
}