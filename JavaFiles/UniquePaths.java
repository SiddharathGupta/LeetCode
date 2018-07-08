class Solution {
    public int uniquePaths(int m, int n) {
        int[][] opt = new int[n][m];
        Arrays.fill(opt[0], 1);
        for(int i=0;i<n;i++) opt[i][0] = 1;
        for(int i=1;i<n;i++) {
            for(int j=1;j<m;j++) {
                opt[i][j] = opt[i-1][j] + opt[i][j-1];
            }
        }
        return opt[n-1][m-1];
    }
}