class Solution {
    public boolean isValid(int[][] image, int sr, int sc, int org){
        return(sr>=0 && sr<image.length && sc>=0 && sc<image[0].length && image[sr][sc]==org) ;       
    }
    public void f(int[][] image, int i, int j, int color,int org){
        image[i][j]=color;
        if(isValid(image,i+1,j,org)){
            f(image,i+1,j,color,org);
        }
        if(isValid(image,i-1,j,org)){
            f(image,i-1,j,color,org);
        }
        if(isValid(image,i,j+1,org)){
            f(image,i,j+1,color,org);
        }
        if(isValid(image,i,j-1,org)){
            f(image,i,j-1,color,org);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int org=image[sr][sc];
        if(org!=color){
            f(image,sr,sc,color,org);
        }
        return image;
    }
}