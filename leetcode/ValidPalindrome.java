// Solves https://leetcode.com/problems/valid-palindrome/

import java.util.Scanner;

public class ValidPalindrome {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
        System.out.printf("Two Pointer: %s%n", isPalindromeTwoPointer(str));
    }

    public static boolean isPalindrome(String s){

        s = s.replaceAll("[^a-zA-Z0-9]","");
        String lowerS = s.toLowerCase();

        StringBuilder res = new StringBuilder();
        res.append(lowerS);
        res.reverse();

        return lowerS.contentEquals(res);
    }

        public static boolean isPalindromeTwoPointer(String s){

            int start = 0;
            int end = s.length()-1;

            while(start<end){
                while(start<end && !Character.isLetterOrDigit(s.charAt(start))){
                    start++;
                }
                while(start<end && !Character.isLetterOrDigit(s.charAt(end))){
                    end--;
                }

                if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                    return false;
                }
                start++;
                end--;
            }

            return true;
        }
}
