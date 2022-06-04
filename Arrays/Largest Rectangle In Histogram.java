class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nsr = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(st.size() > 0 && heights[i] <= heights[st.peek()]){
                st.pop();
            }
            nsr[i] = st.size() == 0 ? n : st.peek();
            st.push(i);
        }
        
        int[] nsl = new int[n];
        st = new Stack<>();
        for(int i=0;i<n;i++){
            while(st.size() > 0 && heights[i] <= heights[st.peek()]){
                st.pop();
            }
            nsl[i] = st.size() ==0 ? -1 : st.peek();
            st.push(i);
        }
        
        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max,(nsr[i] - nsl[i] - 1) * heights[i]);
        }
        return max;
    }
}