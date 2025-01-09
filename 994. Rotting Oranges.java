class Pair{
    int i;
    int j;
    Pair(int i, int j){
        this.i = i;
        this.j = j;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<Pair>();
        int m = grid[0].length;
        int n = grid.length;
        int count = 0;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(grid[i][j] == 2){
                    q.offer(new Pair(i,j));
                }
            }
        }
        q.offer(new Pair(-1,-1));

        while(!q.isEmpty()){
            Pair node = q.poll();
            if(node.i == -1 && node.j == -1){
                if (q.isEmpty())
                    continue;
                q.offer(new Pair(-1,-1));
                count++;
                continue;
            }
            int i = node.i;
            int j = node.j;

            if (i > 0 && grid[i - 1][j] == 1) {
                q.offer(new Pair(i - 1, j));
                grid[i - 1][j] = 2;
            }

            if (i < n - 1 && grid[i + 1][j] == 1) {
                q.offer(new Pair(i + 1, j));
                grid[i + 1][j] = 2;
            }

            if (j > 0 && grid[i][j - 1] == 1) {
                q.offer(new Pair(i, j - 1));
                grid[i][j - 1] = 2;
            }

            if (j < m - 1 && grid[i][j + 1] == 1) {
                q.offer(new Pair(i, j + 1));
                grid[i][j + 1] = 2;
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(grid[i][j] == 1) return -1;
            }
        }

        return count;
    }
}
