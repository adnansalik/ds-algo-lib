import java.util.Scanner;

public class reverseANum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNum = num;
        int rev = 0;

        while (num!=0){
            int lastDig = num%10;
            if(rev>Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && lastDig>7)){
                System.out.print("0");
            }
            if(rev<Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && lastDig<-8)){
                System.out.print("0");
            }
            rev = rev*10 + lastDig;
            num = num/10;
        }
        System.out.println(rev);
    }
}
