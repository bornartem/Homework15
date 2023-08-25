import java.util.Arrays;

public class Main {

    public static void printNumbers() {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i]);
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {
                System.out.print(numbers[i] + 1);
            }
        }
        System.out.println();
        for (int i = 2; i < numbers.length - 3; i++) {
            System.out.print(numbers[i]);
        }
    }

    public static void main(String[] args) {
        printNumbers();
    }
}