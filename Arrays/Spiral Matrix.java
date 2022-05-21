class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int left = 0;
        int right = m - 1;
        int top = 0;
        int bottom = n - 1 ;
        int dir = 0;
        List<Integer> ans = new ArrayList<>();
        if(n == 0){
            return ans;
        }
        while(left <= right && top <= bottom){
            if(dir == 0){
                for(int i=left;i<=right;i++){
                    ans.add(mat[top][i]);
                }
                dir = 1;
                top++;
            }
            else if(dir == 1){
                for(int i=top;i<=bottom;i++){
                    ans.add(mat[i][right]);
                }
                dir = 2;
                right--;
            }
            else if(dir == 2){
                for(int i=right;i>=left;i--){
                    ans.add(mat[bottom][i]);
                }
                dir = 3;
                bottom--;
            }
            else if(dir == 3){
                for(int i=bottom;i>=top;i--){
                    ans.add(mat[i][left]);
                }
                dir = 0;
                left++;
            }
        }
        return ans;
    }
}