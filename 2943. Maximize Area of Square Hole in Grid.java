class Solution {
    public int longestsequence(int[] arr){
        int n = arr.length;

        int side=1,c=1;

        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]+1){
                c++;
            }
            else{
                c=1;
            }
            side = Math.max(side,c);
        }
        return side;
    }
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);

        int h = longestsequence(hBars);
        int v = longestsequence(vBars);

        int len = Math.min(h+1,v+1);

        return len*len;

    }
}
