import java.util.Arrays;
import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxArea(arr));

    }

    public static int maxArea(int[] height){
        int area = 0;
        System.out.println(Arrays.toString(height));
        return area;
    }
}
