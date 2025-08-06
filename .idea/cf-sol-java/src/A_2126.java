
import java.util.Scanner;

public class A_2126 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int n = sc.nextInt();
            System.out.println(getMin(n));
        }
    }

    static int getMin(int num){
        if (num<10) {
            return num;
        }else{
            int min = 1000;
            for(int j=num;j>0;j/=10){
                if(j%10 < min){
                    min = j%10;
                }
            }
            return min;
        }
    }
}


// 9 MINS