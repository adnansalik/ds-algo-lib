import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkArmstrong(n,getDig(n)));
    }

    static int getDig(int n){
        n = Math.abs(n);
        int dig = 0;
        while(n>0){
            n/=10;
            dig++;
        }
        return dig;
    }

    static String checkArmstrong(int n,int dig){
        int sum = 0;
        for (int i = n; i >0; i/=10) {
            int lastDig = i%10;
            sum += (int) Math.pow(lastDig,dig);
        }
        if (sum == n){
            return "Armstrong";
        }else{
            return "Not an Armstrong";
        }
    }
}
