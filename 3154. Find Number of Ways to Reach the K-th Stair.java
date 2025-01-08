class Solution {
    int helper(int curr,int j,int k ,int flag,HashMap<String,Integer> map){
        if(curr-k > 1) return 0;

        String key = (curr+""+j+""+flag);
        if(map.containsKey(key)) return map.get(key);

        int count = curr==k? 1: 0;
        if(flag==1 && curr>0){
            count += helper(curr-1, j, k, 0,map);
        }
        count += helper(curr+(1<<j), j+1, k, 1,map);

        map.put(key, count);
        return count;
    }
    public int waysToReachStair(int k) {
        HashMap<String,Integer> map = new HashMap<>();
        return helper(1,0,k,1,map);
    }
}
