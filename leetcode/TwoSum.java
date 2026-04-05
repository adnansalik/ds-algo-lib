/*
    Two Sum
    Solves: https://leetcode.com/problems/two-sum/description/
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TwoSum {
    static Scanner sc = new Scanner(System.in);
    public static void main() {
        int[] nums = Arrays.stream(sc.nextLine().split(","))
                    .map(String::trim)
                    .mapToInt(Integer::parseInt)
                    .toArray();
        int target = sc.nextInt();

        System.out.println(Arrays.toString(twoSumHasMap(nums, target)));

    }
    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        if(nums.length==2){
            return new int[] {0,1};
        }

        // bruteforce methof
        // for(i in nums)
        //      for(j in nums)
        //          if(nums[i] == nums [j]) return {i,j}

        for (int i = 0; i < nums.length; i++) {
            for (int j=0;j<nums.length;j++){
                if(i==j) continue;

                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }

//    public static int[] twoSumHasMap(int[] nums, int target){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i],i);
//        }
//
//        int[] result = new int[2];
//
//        for (int i = 0; i < nums.length; i++) {
//            int required = target - nums[i];
//            if(map.containsKey(required) && map.get(required) != i){
//                result[0] = i;
//                result[1] = map.get(required);
//                break;
//            }
//        }
//        return result;
//    }

    public static int[] twoSumHasMap(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i<nums.length; i++){
            int num = nums[i];
            int diff = target - num;
            if (map.containsKey(diff)){
                return new int[]{i,map.get(diff)};
            }else{
                map.put(num,i);
            }
        }
        return null;
    }
}
