import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //The triangle may be constructed in the following manner:
        // In row 0 (the topmost row), there is a unique nonzero entry 1.
        // Each entry of each subsequent row is constructed by adding the number above and to the left with the number above and to the right,
        // treating blank entries as 0. For example, the initial number in the first (or any other) row is 1 (the sum of 0 and 1),
        // whereas the numbers 1 and 3 in the third row are added to produce the number 4 in the fourth row.

        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(1);

        if (n == 1) {
            return;
        }

        int[] intArr = new int[]{1, 1};
        Arrays.stream(intArr).forEach(el -> System.out.print(el + " "));
        System.out.println();
        if (n == 2) {
            return;
        }else{
            for (int i = 0; i < intArr.length + 1; i++) {
                int[] newArr = new int[intArr.length + 1];
                newArr[0] = 1;
                newArr[newArr.length - 1] = 1;

                for (int j = 1; j < newArr.length - 1; j++) {
                    newArr[j] = intArr[j - 1] + intArr[j];
                }
                Arrays.stream(newArr).forEach(el -> System.out.print(el + " "));
                System.out.println();

                intArr = newArr;

                if (intArr.length == n) {
                    break;
                }
            }
        }

    }
}
