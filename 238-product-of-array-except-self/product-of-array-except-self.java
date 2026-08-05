class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int totalProductWithoutZero = 1;
        int zeroCount = 0;

        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                totalProductWithoutZero *= num;
            }
        }

        for (int i = 0; i < n; i++) {
            if (zeroCount == 0) {
                arr[i] = totalProductWithoutZero / nums[i];
            } else if (zeroCount == 1) {
                arr[i] = (nums[i] == 0) ? totalProductWithoutZero : 0;
            } else {
                arr[i] = 0;
            }
        }

        return arr;
    }
}
