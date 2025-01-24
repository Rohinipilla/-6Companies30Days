class Solution {
    public void dfs(int i,int j,char[][] board,boolean[][] visited){

        if(i<0 || i>=board.length || j<0 || j>=board[0].length || visited[i][j]){
            return;
        }
        if(board[i][j]=='.'){
            return;
        }
        visited[i][j] = true;
        dfs(i,j+1,board,visited);
        dfs(i+1,j,board,visited);
    }
    public int countBattleships(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        boolean[][] visited = new boolean[n][m];
        int res =0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(visited[i][j]==false && board[i][j]=='X'){
                    dfs(i,j,board,visited);
                    res++;
                }
            }
        }

        return res;
    }
}
