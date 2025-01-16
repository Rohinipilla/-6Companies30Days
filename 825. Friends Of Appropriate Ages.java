class Solution {
    public int numFriendRequests(int[] ages) {
        
        int[] freq = new int[121];
        int res =0;
        for(int age: ages){
            freq[age]++;
        }

        for(int i=0;i<121;i++){

            int count1 = freq[i];
            for(int j=0;j<121;j++){
                int count2 = freq[j];

                if (i * 0.5 + 7 >= j) continue;
                if (i < j) continue;
                if (i < 100 && 100 < j) continue;

                res += count1*count2;

                if(i==j){
                    res -= count1;
                }
            }
        }
        return res;
    }
}
