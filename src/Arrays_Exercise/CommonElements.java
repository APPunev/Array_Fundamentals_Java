package Arrays_Exercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] first = scanner.nextLine().split(" ");
        String[] second = scanner.nextLine().split(" ");

        for (String secondWord:second) {
            for (String firstWord:first) {
                if (secondWord.equals(firstWord)) {
                    System.out.print(secondWord + " ");
                }
            }
        }
    }
}
