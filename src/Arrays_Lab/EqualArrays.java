package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int[] first = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(value -> Integer.parseInt(value)).toArray();

            String[] secondArray = scanner.nextLine().split(" ");
            int[] second = new int[secondArray.length];
        for (int i = 0; i < second.length; i++) {
            second[i] = Integer.parseInt(secondArray[i]);
        }
        int sum = 0;
        boolean areIdentical = true;
        for (int i = 0; i < second.length; i++) {
            if (first[i] != second[i]) {
                areIdentical = false;
                System.out.println("Arrays are not identical. Found difference at " + i + " index.");
                break;
            }else{
                sum += first[i];
            }
        }
        if (areIdentical) {
            System.out.println("Arrays are identical. Sum: " + sum);
        }
    }
}
