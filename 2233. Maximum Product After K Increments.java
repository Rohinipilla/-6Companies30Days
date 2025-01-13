class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < nums.length; i++) {
			pq.add(nums[i]);
		}
		while (k-- > 0) {
			int temp = pq.remove();
			temp = temp + 1;
			pq.add(temp);
		}
	    long res = 1;
		while (!pq.isEmpty()) {
			res = res * pq.remove() % 1000000007;
		}
		return (int) (res );
    }
}
