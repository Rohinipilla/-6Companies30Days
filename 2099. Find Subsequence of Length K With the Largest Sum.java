class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        
        PriorityQueue<int[]> pq = new  PriorityQueue<>((a,b)-> (a[0]-b[0]));

        for(int i=0;i<n;i++){
            pq.offer(new int[]{nums[i],i});
            if(pq.size()>k){
                pq.poll();
            }
        }

        Set<Integer> ind = new HashSet<>();

        while(!pq.isEmpty()){
            int[] top = pq.poll();
            ind.add(top[1]);
        }
        
        int[] res = new int[k];
        int j=0;
        for(int i=0;i<n;i++){
            if(ind.contains(i)){
                res[j] = nums[i];
                j++;
            }
        }

        return res;
        
    }
}
