class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        
        int n = nums.length;
        int res = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){

                int last = -1,flag = 1;
                for(int k=0;k<n;k++){
                    if(k>=i && k<=j){
                        continue;
                    }
                    if(last>=nums[k]){
                        flag =0;
                        break;
                    }
                    last = nums[k];
                }
                if(flag==1){
                    res++;
                }
            }
        }
        return res;
    }
}
