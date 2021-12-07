package Arrays_Exercise;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());
        //take the first number
        //move all the numbers with one position forward
        //add the first number at the end

        for (int rotation = 0; rotation < rotations; rotation++) {
            String currentFirst = input[0];
            for (int index = 0; index < input.length - 1; index++) {
                input[index] = input[index + 1];
            }
            input[input.length - 1] = currentFirst;
        }
        System.out.println(String.join(" ",input));
    }
}
