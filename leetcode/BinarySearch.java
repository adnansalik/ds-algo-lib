/*
Solves: https://leetcode.com/problems/binary-search/
 */

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(",")).map(String::strip).mapToInt(Integer::parseInt).toArray();
        int target = sc.nextInt();

        System.out.println(search(nums,target));

    }

    public static int search(int[] nums, int target){



        return -1;
    }
}
