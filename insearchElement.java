class Solution {
    public int insearchElementS(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left; // Position where target would be inserted
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.insearchElementS(new int[]{1, 3, 5, 6}, 5)); // Output: 2
        System.out.println(sol.insearchElementS(new int[]{1, 3, 5, 6}, 2)); // Output: 1
        System.out.println(sol.insearchElementS(new int[]{1, 3, 5, 6}, 7)); // Output: 4
    }
}
