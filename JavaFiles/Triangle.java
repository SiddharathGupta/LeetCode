class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int rows = triangle.size();
        int cols = triangle.get(rows-1).size();
        int[][] opt = new int[rows][cols];
        for(int i=rows-1;i>=0;i--) {
            for(int j=triangle.get(i).size()-1;j>=0;j--) {
                if(i == rows-1) opt[i][j] = triangle.get(i).get(j);
                else opt[i][j] = triangle.get(i).get(j) + Math.min(opt[i+1][j], opt[i+1][j+1]);
            }
        }
        return opt[0][0];
    }
}