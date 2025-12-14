import java.util.Arrays;
import java.util.Scanner;

public class B_2167 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i=0; i<t; i++){

            int wordLen = Integer.parseInt(sc.nextLine());
            String words = sc.nextLine();
            String word1 = words.split(" ")[0];
            String word2 = words.split(" ")[1];

            char[] word1Arr = word1.toCharArray();
            Arrays.sort(word1Arr);
            String sortedWord1 = Arrays.toString(word1Arr);

            char[] word2Arr = word2.toCharArray();
            Arrays.sort(word2Arr);
            String sortedWord2 = Arrays.toString(word2Arr);

            if(sortedWord1.equalsIgnoreCase(sortedWord2)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}
