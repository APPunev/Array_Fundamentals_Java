package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scanner.nextLine().split("\\s+")).
                mapToInt(value -> Integer.parseInt(value))
                .toArray();
        int evenSum = 0;
        int oddSum = 0;
        for (int n : numbers) {
            if (n % 2 == 0){
                evenSum += n;
            }else{
                oddSum += n;
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
