class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        
        int n = s.length();
        int start = 0;
        int maxlen =0;
        int currcost = 0;

        for(int i=0;i<n;i++){
            currcost += Math.abs(s.charAt(i)-t.charAt(i));

            while(currcost > maxCost){
                currcost -= Math.abs(s.charAt(start)-t.charAt(start));
                start++;
            }
            maxlen = Math.max(maxlen,i-start+1);
        }

        return maxlen;
    }
}
