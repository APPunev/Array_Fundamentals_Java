package Arrays_Lab;

import java.util.Scanner;

public class PrintNumbersinReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] arrayNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            arrayNumbers[i] = numbers;
        }
        for (int i = arrayNumbers.length - 1; i >= 0 ; i--) {
            System.out.print(arrayNumbers[i] + " ");
        }
    }
}
