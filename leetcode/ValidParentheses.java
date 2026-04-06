import java.util.*;

/*
    Solves: https://leetcode.com/problems/valid-parentheses/description/
 */
public class ValidParentheses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        System.out.println(isValid(inp));
    }

    public static Boolean isValid(String s){

        // Idea is that we store each opening char in a Stack array and for every closing bracket char we will pop the first inserted char from the stack

        Map<Character,Character> bracketMap = new HashMap<>();

        bracketMap.put('{','}');
        bracketMap.put('(',')');
        bracketMap.put('[',']');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if(bracketMap.containsKey(letter)){
                stack.push(bracketMap.get(letter));
            }else{
                if(!stack.isEmpty() && stack.peek().equals(letter)){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static Boolean isValidBetter(String s){
        Map<Character,Character> bracketMap = new HashMap<>();
        bracketMap.put('{','}');
        bracketMap.put('[',']');
        bracketMap.put('(',')');

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()){

            if(bracketMap.containsKey(c)){
                stack.push(bracketMap.get(c));
            }else {
                if(stack.isEmpty() || stack.peek() != c){
                    return false;
                }
                stack.pop();
            }

        }
        return stack.isEmpty();
    }

}
