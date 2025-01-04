class Solution {
    public static int dot(List<Integer> needs,List<Integer> price){
        int sum =0;
        for(int i=0;i<price.size();i++){
            sum += price.get(i)*needs.get(i);
        }
        return sum;
    }
    public static int helper(List<Integer> price, List<List<Integer>> special, List<Integer> needs,Map<List<Integer>,Integer>  dp){

        if(dp.containsKey(needs)){
            return dp.get(needs);
        }

        int i=0,res = dot(needs,price);
        for(List<Integer> s: special){

            ArrayList<Integer> clone = new ArrayList<>(needs);
            for(i=0;i<needs.size();i++){
                int diff = clone.get(i) - s.get(i);

                if(diff<0){
                    break;
                }
                clone.set(i,diff);
            }
            if(i==needs.size()){
                res = Math.min(res,s.get(i)+helper(price,special,clone,dp));
            }
        }
        dp.put(needs,res);
        return res;
    }
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        
        Map<List<Integer>,Integer>  dp = new HashMap();

        return helper(price,special,needs,dp);
    }
}
