import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하시오 : ");
        int i = sc.nextInt();
        System.out.println(fact(i));
    }
    public static int fact(int i)
    {
        if(i<=0)
            return 1;
        return i*fact(i-1);
    }
}