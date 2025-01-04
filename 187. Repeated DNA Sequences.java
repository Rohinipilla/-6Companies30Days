class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        int n = s.length();

        Set<String> seen = new HashSet<>();
        Set<String> res = new HashSet<>();

        for(int i=0;i<n-9;i++){
            String str = s.substring(i,i+10);

            if(seen.contains(str)){
                res.add(str);
            }
            seen.add(str);
        }
        List<String> list = new ArrayList<>(res);
        return list;
    }
}
