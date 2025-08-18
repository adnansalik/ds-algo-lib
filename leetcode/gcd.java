import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(findGcd(n1,n2));
    }

    static int findGcd(int n1,int n2){
        if(n2 == 0){
            return n1;
        }
        return findGcd(n2,n1%n2);
    }
}
