
import java.util.Scanner;

// Solves https://leetcode.com/problems/valid-anagram/description/
public class ValidAnagram {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(isAnagram(s1,s2));
    }

    public static boolean isAnagram(String s, String t) {
        // base condition
        if(s.length() != t.length()){
            return false;
        }

        int[] alphabets = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);

            alphabets[schar - 'a']++;
            alphabets[tchar - 'a']--;
        }

        for (int num : alphabets){
            if(num != 0){
                return false;
            }
        }

        return true;
    }
}
