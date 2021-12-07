package Arrays_Exercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagonCount = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int[] passengersArray = new int[wagonCount];
        for (int i = 0; i < wagonCount; i++) {
            int passengerCount = Integer.parseInt(scanner.nextLine());
            sum += passengerCount;
            passengersArray[i] = passengerCount;
        }
        for (int number:passengersArray) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
