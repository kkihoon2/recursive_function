public class Main {
    public static void main(String[] args) {
        //TODO..수를 입력받아 홀수인지 여부를 리턴해야 합니다.
        boolean output = isOdd(17);
        System.out.println(output);

        output = isOdd(-8);
        System.out.println(output);
    }
    public static boolean isOdd(int num)
    {
        if(num==1||num==-1) {
            return true;
        }
        if(num==0)
            return false;
        if(num<0) {
            num=num+2;
        }else num = num-2;
        return isOdd(num);
    }
}