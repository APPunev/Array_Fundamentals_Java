package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rightSum = 0;
        int leftSum = 0;
        boolean isFound = false;
        //1. itarate the first loop
        for (int mainIndex = 0; mainIndex < input.length; mainIndex++) {
            rightSum = 0;
            leftSum = 0;
            for (int right = 0; right < mainIndex; right++) {
                rightSum += input[right];
            }

            for (int left = mainIndex + 1; left < input.length; left++) {
                leftSum += input[left];
            }
            if (rightSum == leftSum) {
                System.out.println(mainIndex);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("no");
        }
    }
}
