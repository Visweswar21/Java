import java.util.HashMap;
import java.util.Scanner;

public class pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(countPairs(nums, k));
        sc.close();
    }

    public static int countPairs(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            int complement = k - num;
            // Check if complement exists in freqMap
            if (freqMap.containsKey(complement)) {
                count += freqMap.get(complement);
            }
            // Update frequency of current num
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        return count;
    }
}
