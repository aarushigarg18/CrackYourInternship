class Solution {
    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == 1){
                    int live = count(board,i,j);
                    if(live < 2 || live > 3){
                        board[i][j] = 2; 
                    }
                }
                else if(board[i][j] == 0){
                    int live = count(board,i,j);
                    if(live == 3){
                        board[i][j] = 3;
                    }
                }
            }
        }
        changeBoard(board);
        return;
    }
    
    public void changeBoard(int[][] board){
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == 2){
                    board[i][j] = 0;
                }
                else if(board[i][j] == 3){
                    board[i][j] = 1;
                }
            }
        }
    }
    
    public int count(int[][] board,int row,int col){
        int count = 0;
        int n = board.length;
        int m = board[0].length;
        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
        for(int[] dirs : dir){
            int r = row + dirs[0];
            int c = col + dirs[1];
            if(r >= 0 && c >= 0 && r < n && c < m && (board[r][c] == 1 || board[r][c] == 2)){
                count++;
            }
        }
        return count;
    }
}