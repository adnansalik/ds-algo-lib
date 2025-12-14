import java.util.HashSet;
import java.util.Scanner;

public class A_2167 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        boolean isAllSame = true;
        for (int i=0;i<t;i++){
            HashSet<Integer> sides = new HashSet<>();
            for(int j =0;j<4;j++){
                int side = sc.nextInt();
                sides.add(side);
            }
            if(sides.size()>1){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
        }

    }
}
