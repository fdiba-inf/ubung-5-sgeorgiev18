package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        for (int i = 0; i < numbers.length - 1; ++i) {
          for (int k = i + 1; k < numbers.length; ++k) {
            if (numbers [i] > numbers [k]) {
              int y = numbers [k];
              numbers [i] = numbers [k];
              numbers [k] = y;
            }
          }          
        }

        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Sorted numbers: " + numbersAsString);
    }
}
