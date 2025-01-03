class Solution {
    public int findTheWinner(int n, int k) {
        
        int res = 0;

        for(int i=1;i<=n;i++){
            res = (res+k)%i;
        }
        return res+1;
    }
}

//previously solved approach

// class Solution {
//     public int findTheWinner(int n, int k) {

//         List<Integer> res = new LinkedList<Integer>();

//         for(int i=0;i<n;i++){
//             res.add(i);
//         }

//         int start = 0;

//         while(res.size()>1){
//             int rem = (start+k-1) % res.size();

//             res.remove(rem);

//             start = rem;
//         }
//         return res.getFirst()+1;
//     }
// }
