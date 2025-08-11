import java.util.Scanner;

public class scratchPad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = x;
        if(x<0){
            x = -1 *x;
        }
        String num = Integer.toString(x);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(num);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        String str = stringBuilder.toString();
        long val = Integer.parseInt(str);
        if(y<0){
            val = val * -1;
        }
        System.out.println(val);
    }
}