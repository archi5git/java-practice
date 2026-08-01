class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startColor = image[sr][sc];
        if (startColor == color) return image; // no change needed
        dfs(image, sr, sc, startColor, color);
        return image;
    }
    
    private void dfs(int[][] image, int r, int c, int startColor, int newColor) {
        // boundary check
        if (r < 0 || c < 0 || r >= image.length || c >= image[0].length) return;
        // stop if not the same color
        if (image[r][c] != startColor) return;
        
        // recolor
        image[r][c] = newColor;
        
        // explore neighbors
        dfs(image, r+1, c, startColor, newColor);
        dfs(image, r-1, c, startColor, newColor);
        dfs(image, r, c+1, startColor, newColor);
        dfs(image, r, c-1, startColor, newColor);
    }
}
