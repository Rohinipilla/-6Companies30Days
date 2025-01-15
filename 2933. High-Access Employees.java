class Solution {
    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        
        Map<String,List<Integer>> map = new HashMap<>();

        for(List<String> l : access_times){
            String a = l.get(0),b=l.get(1);
            map.computeIfAbsent(a, k -> new ArrayList<>()).add(Integer.parseInt(b));
        }

        List<String> res = new ArrayList<>();

        for(Map.Entry<String,List<Integer>> entry : map.entrySet()){

            if(entry.getValue().size()>2){
                entry.getValue().sort(null);

                int k = entry.getValue().size();

                for(int i=2;i<k;i++){

                    if(entry.getValue().get(i)-entry.getValue().get(i-2)<100){
                        res.add(entry.getKey());
                        break;
                    }
                }
            }
            
        }

        return res;
    }
}
