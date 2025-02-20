class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);

        int n = nums.length;
        int left = 0, right = 1, count = 0;

        while (left < n && right < n) {
            if (left == right || nums[right] - nums[left] < k) {
                
                right++;
            } else if (nums[right] - nums[left] > k) {
               
                left++;
            } else {
               
                count++;
                left++;
                right++;

                
                while (left < nums.length && nums[left] == nums[left - 1]) {
                    left++;
                }
            }
        }
        return count;
    }
}
