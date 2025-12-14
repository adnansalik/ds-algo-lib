import java.util.HashSet;
import java.util.Scanner;
public class
A_1041 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int j=0;j<n;j++){
                a[j] = sc.nextInt();
            }
            System.out.println(getMinMexMax(a));
        }
    }

    static String getMinMexMax(int[] a){
        HashSet<Integer> arrSet = new HashSet<>();
        for (int j : a) {
            if (j == 0) {
                return "NO";
            }
            if (j == -1) {
                continue;
            }
            arrSet.add(j);
        }
        if(arrSet.isEmpty() || arrSet.size()==1){
            return "YES";
        }else{
            return "NO";
        }
    }
}

// 1Day with help