import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the total number of numbers
        System.out.println("Enter Total Number : ");
        int N = scanner.nextInt();

        // Input the numbers
        System.out.println("Enter Numbers : ");
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Input the total number of test cases
        System.out.println("How many TestCase : ");
        int Q = scanner.nextInt();

        // Create a map to store the frequency of each number
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Process each test case
        for (int i = 0; i < Q; i++) {
            int query = scanner.nextInt();

            // Check if the number is present in the frequency map
            if (frequencyMap.containsKey(query)) {
                System.out.println(frequencyMap.get(query));
            } else {
                System.out.println("NOT PRESENT");
            }
        }

        scanner.close();
    }
}