class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] trans = new int[c][r];

        for(int j=0;j<c;j++)
        {
            for(int i=0;i<r;i++)
            {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }
}