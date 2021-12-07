package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dnaLength = Integer.parseInt(scanner.nextLine());

        int[] currentSample = new int[dnaLength];
        int[] bestSample = new int[dnaLength];
        int leftMostIndex = dnaLength;
        int bestSampleSeqLength = 0;
        int bestSampleSum = 0;
        int bestSampleNumber = 0;

        String command = scanner.nextLine();
        int sampleNum = 0;

        while(!command.equals("Clone them!")){
            currentSample = Arrays.stream(command.split("\\!+")).mapToInt(Integer::parseInt).toArray();

            sampleNum++;

            int currentSeqLenght = 0;
            int previousSeqLength = 0;
            int currentLongestSeq = 0;

            int leftMostIndexInCurrent = dnaLength;
            int currentSum = 0;

            for (int i = 0; i < currentSample.length; i++) {
                if (currentSample[i] == 1) {
                    currentSeqLenght++;
                    currentSum++;
                }else{
                    previousSeqLength = currentSeqLenght;
                    currentSeqLenght = 0;
                }

                if (currentSeqLenght > previousSeqLength) {
                    currentLongestSeq = currentSeqLenght;
                    leftMostIndexInCurrent = i - currentSeqLenght + 1;
                }
            }
            if (currentLongestSeq > bestSampleSeqLength) {
                bestSampleSeqLength = currentLongestSeq;
                leftMostIndex = leftMostIndexInCurrent;
                bestSample = currentSample;
                bestSampleNumber = sampleNum;
                bestSampleSum = currentSum;
            }else if (currentLongestSeq == bestSampleSeqLength) {
                if (leftMostIndexInCurrent < leftMostIndex) {
                    leftMostIndex = leftMostIndexInCurrent;
                    bestSample = currentSample;
                    bestSampleNumber = sampleNum;
                    bestSampleSum = currentSum;
                }
            }else if (leftMostIndex == leftMostIndexInCurrent) {
                if (currentSum == bestSampleSum) {
                    bestSampleSum = currentSum;
                    bestSample = currentSample;
                    bestSampleNumber = sampleNum;
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n",bestSampleNumber, bestSampleSum);
        for (int number:bestSample) {
            System.out.print(number+" ");
        }
    }

}