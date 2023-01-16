public class Main {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            gugudan(i,1);
        }

    }
    public static void gugudan(int i,int cnt)
    {
        if(cnt>9)
            return;
        System.out.printf("%d * %d = %d",i,cnt,i*cnt);
        System.out.println();
        gugudan(i,++cnt);
    }
}