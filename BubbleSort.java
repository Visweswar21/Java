import java.util.Arrays;

public class BubbleSort{

    public static void main(String[] args) {
        int[] numbers = {5, 2, 4, 1, 3};

        // Optimized Bubble Sort
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) { // Optimization here
                if (numbers[j] > numbers[j + 1]) {
                    // Swap numbers[j] and numbers[j + 1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Print the sorted numbers
        System.out.println("Sorted List:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Print the array in one line
        System.out.println("Sorted Array (one line): " + Arrays.toString(numbers));
    }
}
