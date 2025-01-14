class Solution {
    public int wordCount(String[] startWords, String[] targetWords) {
        int n = startWords.length;
        int res =0;
        Set<String> set = new HashSet<>();

        for(String start: startWords){
            char[] str = start.toCharArray();
            Arrays.sort(str);
            set.add(new String(str));
        }

        int m = targetWords.length;
        
        for(int i=0;i<m;i++){
            char[] tr = targetWords[i].toCharArray();
            Arrays.sort(tr);

            int k= tr.length;
            String s = String.valueOf(tr);

            for(int j=0;j<k;j++){
                String str = s.substring(0,j)+s.substring(j+1);

                if(set.contains(str)){
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}
