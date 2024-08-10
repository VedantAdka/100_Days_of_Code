class Solution {
    public boolean isValid(int[][] image, int sr, int sc, int org) {
        // Ensure within bounds and the pixel matches the original color
        return sr >= 0 && sr < image.length && sc >= 0 && sc < image[0].length && image[sr][sc] == org;
    }

    public void f(int[][] image, int sr, int sc, int color, int org) {
        // Color the current pixel
        image[sr][sc] = color;
        
        // Recursively color neighboring pixels if they are valid
        if (isValid(image, sr + 1, sc, org)) {
            f(image, sr + 1, sc, color, org);
        }
        if (isValid(image, sr - 1, sc, org)) {
            f(image, sr - 1, sc, color, org);
        }
        if (isValid(image, sr, sc + 1, org)) {
            f(image, sr, sc + 1, color, org);
        }
        if (isValid(image, sr, sc - 1, org)) {
            f(image, sr, sc - 1, color, org);
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int org = image[sr][sc];
        if (org != color) {
            f(image, sr, sc, color, org);
        }
        return image;
    }
}