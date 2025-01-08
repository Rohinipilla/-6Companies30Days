class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long res = 0;
        int n = nums.length;

        int start =0,end =0;

        long sum =0;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(end=0;end<n;end++){
            int curr = nums[end];

            int prevind = map.getOrDefault(curr,-1);

            while(start<=prevind || end-start+1>k){
                sum -= nums[start];
                start++;
            }
            map.put(curr,end);
            sum += nums[end];

            if(end-start+1==k){
                res = Math.max(res,sum);
            }
           
        }
        return res;

    }
}
