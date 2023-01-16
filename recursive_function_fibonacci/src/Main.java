public class Main {
    public static void main(String[] args) {
        int output = fibonacci(5);
        System.out.println(output); // ->> 5

        output = fibonacci(9);
        System.out.println(output); // ->> 34
    }
    public static int fibonacci(int num){
        if(num==0)
            return 0;
        if(num==1)
            return 1;
        return fibonacci(num-1)+fibonacci(num-2);
    }
}