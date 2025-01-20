class Solution {
    public static String encode(String s) {
        // code here
        StringBuilder res = new StringBuilder();
        int n = s.length();
        
        for(int i=0;i<n;i++){
            int count =1;
            
            char ch = s.charAt(i);
            while(i<n-1 && s.charAt(i) == s.charAt(i+1)){
                
                count++;
                i++;
                
            }
            
            res.append(ch);
            res.append(count);
        }
        
        return res.toString();
    }
}
