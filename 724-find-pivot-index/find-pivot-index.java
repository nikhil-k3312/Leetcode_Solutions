class Solution {
    public int pivotIndex(int[] nums) {
        int t_sum = 0;
        int l_sum = 0;
        int r_sum = 0;
        for(int num : nums){
            t_sum += num;
        }
        for(int i = 0; i < nums.length; i++){
            r_sum = t_sum - l_sum - nums[i];
            if(l_sum == r_sum){
                return i;
            }
            l_sum += nums[i];
        }
        return -1;
    }
}