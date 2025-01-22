class Solution {

    Map<Integer,Integer> map = new HashMap<>();

    int nr,nc,rem;
    Random rand = new Random();
    public Solution(int m, int n) {
        nr = m;
        nc = n;
        rem = nr * nc;
    }
    
    public int[] flip() {
        int r = rand.nextInt(rem--);
        int x = map.getOrDefault(r, r);
        map.put(r, map.getOrDefault(rem, rem));
        return new int[]{x / nc, x % nc};
    }
    
    public void reset() {
        map.clear();
        rem = nr * nc;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(m, n);
 * int[] param_1 = obj.flip();
 * obj.reset();
 */
