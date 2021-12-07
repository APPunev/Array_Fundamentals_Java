package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(value -> Integer.parseInt(value)).toArray();
        int[] condensed = new int[nums.length - 1];
        if (nums.length == 1) {
            System.out.println(nums[0]);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < condensed.length - i; j++) {
                condensed[j] = nums[j] + nums[j + 1];
            }
            nums = condensed;
        }
        System.out.println(condensed[0]);
    }
}
