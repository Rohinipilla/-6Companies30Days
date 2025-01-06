class Solution {
    public String convertToTitle(int columnNumber) {

        StringBuilder res = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            int d = columnNumber%26;
            char ch = (char)(d+'A');
            res.append(ch);
            columnNumber = columnNumber/26;
        }
        return res.reverse().toString();
    }
}
