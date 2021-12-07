package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int number = Integer.parseInt(scanner.nextLine());

        for (int index1 = 0; index1 < input.length; index1++) {
            for (int index2 = index1 + 1; index2 < input.length; index2++) {
                if (input[index1] + input[index2] == number) {
                    System.out.println(input[index1]+" "+input[index2]);
                }
            }
        }
    }
}
