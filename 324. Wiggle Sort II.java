class Solution {
    public void wiggleSort(int[] nums) {
        
        Arrays.sort(nums);

        int[] sorted = nums.clone();
        int n = nums.length;
        
        int mid = (n - 1) / 2; 
        int end = n - 1; 
        for(int i=0;i<n ;i++){

           if (i % 2 == 0) {
                nums[i] = sorted[mid--]; 
            } else {
                nums[i] = sorted[end--]; 
            }
        }
        
    }
}
