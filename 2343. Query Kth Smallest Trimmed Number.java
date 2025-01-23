class Solution {
    private class Pair{

        String num;
        int index;

        Pair(String num,int index){
            this.num = num;
            this.index = index;
        }
    }

    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        
        int[] res = new int[queries.length];
        int n = nums.length;

        for(int q=0;q<queries.length;q++){
            int k = queries[q][0];
            int trim = queries[q][1];

            List<Pair> pq = new ArrayList<>();

            for(int i=0;i<n;i++){
                String numstr = String.valueOf(nums[i]);
                String trimmed = numstr.substring(numstr.length()-trim);
                pq.add(new Pair(trimmed,i));
            }

            pq.sort((a,b)->a.num.compareTo(b.num));
            res[q] = pq.get(k-1).index;
        }

        return res;
    }
}
