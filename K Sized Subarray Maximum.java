class Solution {
    // Function to find maximum of each subarray of size k.
    public ArrayList<Integer> max_of_subarrays(int arr[], int k) {
        // Your code here
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        
        // store index
        Deque < Integer > q = new ArrayDeque < > ();
        for (int i = 0; i < arr.length; i++) {
            
            if (!q.isEmpty() && q.peek() == i - k) {
                q.poll();
            }
            // remove smaller numbers in k range as they are useless
            while (!q.isEmpty() && arr[q.peekLast()] < arr[i]) {
                q.pollLast();
            }

            q.offer(i);
            if (i >= k - 1) {
                res.add(arr[q.peek()]);
            }
        }
        return res;
        
    }
}
