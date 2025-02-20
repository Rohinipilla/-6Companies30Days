class Solution{
    static String printMinNumberForPattern(String S){
        // code here
        int n=S.length();
        char[] arr=new char[n+1];
        for(int i=0;i<n+1;i++){
            arr[i]=(char)(i+1+'0');
        }
        
        for(int i=n-1;i>=0;i--){
            if(S.charAt(i)=='D'){
                swap(arr,i,i+1);
                int j=i+1;
                while(j<n && S.charAt(j)=='D'){
                    swap(arr,j,j+1);
                    j++;
                }
            }
        }
        String res = new String(arr);
        return res;
    }
    
    
    static void swap(char[] arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
