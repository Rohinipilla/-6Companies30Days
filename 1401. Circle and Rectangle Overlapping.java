class Solution {
    public int getdist(int start,int end,int center){

        if(start<=center && center<=end){
            return 0;
        }
        if(center<start){
            return start-center;
        }
        return center-end;
    }
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        
        int xnear = getdist(x1,x2,xCenter);
        int ynear = getdist(y1,y2,yCenter);

        return xnear*xnear + ynear*ynear <= radius*radius;
    }
}
