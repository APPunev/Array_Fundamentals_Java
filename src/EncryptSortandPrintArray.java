import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortandPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double result = 0;
        int[] finalArr = new int[n];
        double[] doubleArr = new double[0];

        for (int i = 0; i < n; i++) {

            result = 0;
            String text = scanner.nextLine();
            char[] textArr = text.toCharArray();
            doubleArr = new double[textArr.length];
            for (int j = 0; j < textArr.length; j++) {
                if (textArr[j] == 'a' || textArr[j] == 'e' ||textArr[j] == 'i' ||textArr[j] == 'o' ||textArr[j] == 'u'
                || textArr[j] == 'A' || textArr[j] == 'E' ||textArr[j] == 'I' ||textArr[j] == 'O' ||textArr[j] == 'U') {
                    result = textArr[j] * textArr.length;

                }else{
                    result = textArr[j] / textArr.length;
                }
                doubleArr[j] = result;
            }
            int totalResult = 0;
            for (int j = 0; j < doubleArr.length; j++) {
                totalResult += doubleArr[j];
            }
            finalArr[i] = totalResult;
        }
        Arrays.stream(finalArr).sorted().forEach(el -> System.out.println(el));
    }
}
