class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int mid;

        if(n%2==0){
            mid = (nums[n/2 -1]+nums[n/2])/2;
        }
        else{
            mid = nums[n/2];
        }

        int res = 0;

        for(int i=0;i<n;i++){
            if(nums[i]<mid){
                res = res + (mid-nums[i]);
            }
            else if(nums[i]>mid){
                res = res + (nums[i]-mid);
            }
        }
        return res;
    }
}
