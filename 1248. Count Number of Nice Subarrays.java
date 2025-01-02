class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        int currsum =0;
        int count =0;

        Map<Integer,Integer> map = new HashMap<>();
        map.put(currsum,1);
        
        int n = nums.length;
        for(int i=0;i<n;i++){
            currsum += nums[i]%2;

            if(map.containsKey(currsum-k)){
                count = count+ map.get(currsum-k);
            }

            map.put(currsum,map.getOrDefault(currsum,0) +1);
        }
        return count;
    }
}
