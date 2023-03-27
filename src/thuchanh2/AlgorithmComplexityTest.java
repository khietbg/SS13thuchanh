package thuchanh2;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        AlgorithmComplexityTest();
    }
    public static void AlgorithmComplexityTest (){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int frequentChar[] = new int[255];
        for (int i = 0; i < string.length(); i++) {
            int ascii = (int) string.charAt(i);
            frequentChar[ascii] += 1;
        }
        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 255; j++) {

            if (frequentChar[j] > max) {
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}
