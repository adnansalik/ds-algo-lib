import java.util.Scanner;
public class A_2013 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(getMaxHikes(n,x,y));
        }
    }

    static int getMaxHikes(int n, int x, int y){
        int minus_from = Math.min(y, x);
        return (int) Math.ceil((double) n /minus_from);
    }
}

// 37 MINS