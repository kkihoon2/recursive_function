public class Main {
    public static void main(String[] args) {

        int output = factorial(10);
        System.out.println(output); // --> 3628800
    }
    public static int factorial(int num)
    {
        if(num<=0)
            return 1;
        return num*factorial(num-1);
    }
}