class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        long sum = 0;
        long n = arr.length;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        long rep=0;
        for(int i=0;i<arr.length;i++){
            int index=Math.abs(arr[i])-1;
            if(arr[index]<0){
                rep=(long)Math.abs(arr[i]);
                break;
            }
           arr[index] = -arr[index];
        }
       
        long nsum=sum-rep;
      
        
        long rsum=n*(n+1)/2;
        
        long miss=rsum-nsum;
        
        list.add((int)rep);
        list.add((int)miss);
        return list;
    }
}
