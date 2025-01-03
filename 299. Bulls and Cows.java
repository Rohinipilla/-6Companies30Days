class Solution {
    public String getHint(String secret, String guess) {
        
        int[] freq = new int[10];
        int n = secret.length();
        int cows =0,bulls=0;

        for(int i=0;i<n;i++){
            int s = secret.charAt(i)-'0';
            int g = guess.charAt(i)-'0';

            if(s==g){
                bulls++;
            }
            else{
                if(freq[s]++ <0) cows++;
                if(freq[g]-- >0) cows++;
            }
        }

        return bulls+"A"+cows+"B";
    }
}
