import java.util.Scanner;

public class scratchPad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));
    }

    static boolean isPalindrome(int x) {
        int originalNum = x;
        int rev = 0;
        if(x<0){
            return false;
        }
        while(x!=0){
            int lastDig = x%10;
            rev = rev*10 + lastDig;
            x = x/10;
        }
        System.out.println(rev);
        return rev==originalNum;
    }
}