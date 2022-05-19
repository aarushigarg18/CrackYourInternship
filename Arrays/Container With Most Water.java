class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n - 1;
        int total = 0;
        while(i < j){
            int heights = Math.min(height[i],height[j]);
            int width = j - i;
            total = Math.max(total,heights * width);
            if(height[i] > height[j]){
                j--;
            }
            else {
                i++;
            }
        }
        return total;
    }
}