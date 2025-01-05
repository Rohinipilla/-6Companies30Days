class Solution {
    public int maxEnvelopes(int[][] envelopes) {

        Arrays.sort(envelopes, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);

        int n = envelopes.length;
        int[] heights = new int[n + 1];
        heights[1] = envelopes[0][1];
        int maxSize = 1;
      
        for (int i = 1; i < n; ++i) {
            int currentHeight = envelopes[i][1];
            if (currentHeight > heights[maxSize]) {
                heights[++maxSize] = currentHeight;
            } else {
                int left = 1, right = maxSize;
                while (left < right) {
                    int mid = (left + right)/2; 
                    if (heights[mid] >= currentHeight) {
                        right = mid;
                    } else {
                        left = mid + 1;
                    }
                }
                int pos = (heights[left] >= currentHeight) ? left : 1;
                heights[pos] = currentHeight;
            }
        }
        
        return maxSize;
    }
}
