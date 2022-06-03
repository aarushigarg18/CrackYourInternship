class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(word.charAt(0) == board[i][j]){
                    boolean[][] vis = new boolean[n][m];
                    if(dfs(board,word,i,j,vis,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean dfs(char[][] board,String word,int i,int j,boolean[][] vis,int idx){
        int n = board.length;
        int m = board[0].length;
        if(idx == word.length()){
            return true;
        }
        
        if(i < 0 || j < 0 || i >= n || j >= m || vis[i][j] == true){
            return false;
        }
        
        if(board[i][j] != word.charAt(idx)){
            return false;
        }
        
        vis[i][j] = true;
        boolean first = dfs(board,word,i+1,j,vis,idx+1);
        boolean second = dfs(board,word,i-1,j,vis,idx+1);
        boolean third = dfs(board,word,i,j+1,vis,idx+1);
        boolean fourth = dfs(board,word,i,j-1,vis,idx+1);
        if(first || second || third || fourth){
            return true;
        }
        vis[i][j] = false;
        return false;
    }
}