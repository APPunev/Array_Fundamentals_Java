package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linesCount = Integer.parseInt(scanner.nextLine());

        String [] firstArray = new String[linesCount];
        String [] secondArray = new String[linesCount];
        for (int lines = 1; lines <= linesCount ; lines++) {
            String[] input = scanner.nextLine().split("\\s+");

            if (lines % 2 != 0) {
                firstArray[lines - 1] = input[0];
                secondArray[lines - 1] = input[1];
            }else{
                firstArray[lines - 1] = input[1];
                secondArray[lines - 1] = input[0];
            }
        }
        System.out.println(String.join(" ",firstArray));
        System.out.println(String.join(" ",secondArray));
    }
}
