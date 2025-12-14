import java.util.*;

public class C_2167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        for (int i=0;i<t;i++){
            long num = Long.parseLong(sc.nextLine());
            String[] toysString = (sc.nextLine()).split(" ");
            int[] toys = new int[Math.toIntExact(num)];
            for (int k=0;k<num;k++){
                toys[k] = Integer.parseInt(toysString[k]);
            }
            Arrays.sort(toys);
            for (int k=0;k<num;k++){
                System.out.print(toys[k]+" ");
            }
            System.out.println();
        }
    }
}
