package Arrays_Exercise;

public class DEMO {
    public static void main(String[] args) {

        int[] old = {1,0,1,1,1,0,1,1};
        int length = 1;
        int maxLength = 0;
        for (int index = 1; index <= old.length - 1 ; index++) {
            if (old[index - 1] == 1 && old[index] == 1) {
                length++;
                if (length > maxLength) {
                    maxLength = length;
                }
            }else{
                length = 1;
            }
        }
    }
}
