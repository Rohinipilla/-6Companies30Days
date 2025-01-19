class Solution {
    private static class Pair{

        final char letter;
        final int count;

        Pair(char letter,int count){
            this.letter = letter;
            this.count = count;
        }
    }
    public String frequencySort(String s) {
        

        Map<Character,Integer> map = new HashMap<>();

        for(char c :s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        PriorityQueue<Pair> maxheap = new PriorityQueue<>((p1,p2) -> Integer.compare(p2.count,p1.count));
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            maxheap.offer(new Pair(entry.getKey(),entry.getValue()));
        }
        StringBuilder res = new StringBuilder();
        while(!maxheap.isEmpty()){
            Pair pair = maxheap.poll();
            res. append(String.valueOf(pair.letter).repeat(pair.count));
        }

        return res.toString();
    }
}
