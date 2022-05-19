class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        int[][] indegree = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int[] dirs : dir){
                    int x = i + dirs[0];
                    int y = j + dirs[1];
                    if(x >= 0 && y >= 0 && x < n && y < m && matrix[i][j] < matrix[x][y]){
                        indegree[x][y]++;
                    }
                }
            }
        }
        
        Queue<Integer> que = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(indegree[i][j] == 0){
                    que.add(i * m + j);
                }
            }
        }
        
        int level = 0;
        while(que.size() > 0){
            int size = que.size();
            while(size-- > 0){
                int rem = que.remove();
                int row = rem / m;
                int col = rem % m;
                for(int[] dirs : dir){
                    int x = row + dirs[0];
                    int y = col + dirs[1];
                    if(x >= 0 && y >= 0 && x < n && y < m && matrix[x][y] > matrix[row][col]){
                        indegree[x][y]--;
                        if(indegree[x][y] == 0){
                            que.add(x * m + y);
                        }
                    }
                }
            }
            level++;
        }
        return level;
    }
}