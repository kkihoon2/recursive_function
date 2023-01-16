package app;

public class Main {
    public static void main(String[] args) {
        recursion();
    }

    private static void recursion() {
        System.out.println("재귀 돌아가는중");
        recursion();
    }
}