public class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
       int m = dungeon.length;
       int n = dungeon[0].length;
       int[][] HP = new int[m][n];
       HP [m -1][n - 1]= Math.max(1, 1 - dungeon[m - 1][n - 1]);
       for (int i = m - 2; i >= 0; i--){
            HP [i][n - 1] = Math.max(1, HP[i + 1][n - 1] - dungeon[i][n - 1]);
       }
       for (int i = n - 2; i >= 0; i--){
            HP [m - 1][i] = Math.max(1, HP[m - 1][i + 1] - dungeon[m - 1][i]);
       }
       for (int i = m - 2; i >= 0; i--){
            for (int j = n - 2; j >= 0; j--){
                HP[i][j] = Math.max(1,Math.min(HP[i + 1][j], HP[i][j + 1]) - dungeon[i][j]);
            }
        }
        return HP[0][0];   
    }
} 