class Solution {
    public int[][] imageSmoother(int[][] img) {

        int n = img.length,m = img[0].length;

        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                int total=0,count=0;

                for(int i=r-1;i<r+2;i++){
                    for(int j=c-1;j<c+2;j++){
                        if(i<0 || i==n || j<0 || j==m){
                            continue;
                        }
                        
                        total += img[i][j] %256;
                        count +=1;
                        
                    }
                }
                img[r][c] = img[r][c] ^ (total/count)<<8;

            }
        }

        for(int r=0;r<n;r++)
            for(int c=0;c<m;c++)
                img[r][c] = img[r][c]>>8;

        return img;
    }
}
