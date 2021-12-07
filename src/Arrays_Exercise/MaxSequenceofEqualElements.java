package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceofEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        // 1 1 2 2 3 3 4 4 4 4 5 5 6
        //loop the array to find the sequence
        // print the sequence
        int counter = 0;
        int longestCounter = 0;
        int number = 0;
        String outputSequence = "";

        for (int index = 0; index < input.length - 1; index++) {
            if (input[index] == input[index + 1]) {
                counter++;
                if (counter > longestCounter) {
                    longestCounter = counter;
                    number = index;
                    outputSequence = String.valueOf(input[index]);
                }
            }else{
                counter = 0;
            }
        }
        for (int i = 0; i <= longestCounter ; i++) {
            System.out.print(outputSequence + " ");
        }
    }
}
