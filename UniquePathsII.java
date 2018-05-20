class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        int[][] opt = new int[rows][cols];
        if(obstacleGrid[0][0] == 1 || obstacleGrid[rows-1][cols-1] == 1) return 0;
        for(int i=0;i<rows;i++) {
            if(obstacleGrid[i][0] == 0) opt[i][0] = 1;
            else break;
        }
        for(int i=0;i<cols;i++) {
            if(obstacleGrid[0][i] == 0) opt[0][i] = 1;
            else break;
        }
        for(int i=1;i<rows;i++) {
            for(int j=1;j<cols;j++) {
                if(obstacleGrid[i][j] == 0) opt[i][j] = opt[i-1][j] + opt[i][j-1];
            }
        }
        return opt[rows-1][cols-1];
    }
}