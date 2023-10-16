class Solution {
    int startColor;

    public void fillNikhil(int i, int j,int[][] image,int color){
        int bR = image[0].length-1;
        int bD = image.length-1;
        if(i>=0 && i<=bD && j>=0 && j<=bR){
            if(image[i][j]==startColor){
                image[i][j]= color;
                fillNikhil(i+1,j,image,color);
                fillNikhil(i,j-1,image,color);
                fillNikhil(i-1,j,image,color);
                fillNikhil(i,j+1,image,color);
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;
        startColor = image[sr][sc];
        fillNikhil(sr,sc,image,color);
        return image;
    }
}