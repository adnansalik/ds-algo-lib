import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

// Solves https://leetcode.com/problems/contains-duplicate/description/
public class ContainsDuplicate {

    static Scanner sc= new Scanner(System.in);
    static void main(String[] args) {
        int[] nums = Arrays.stream(sc.nextLine().split(",")).map(String::strip).mapToInt(Integer::parseInt).toArray();

        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums){
            if(set.contains(num)){
                return true;
            }else{
                set.add(num);
            }
        }

        return false;
    }
}
