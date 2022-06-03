class Solution {
    
    public class pair{
        int diff;
        int x;
        pair(int diff,int x){
            this.diff = diff;
            this.x = x;
        }
    }
    
    public int findMaxValueOfEquation(int[][] points, int k) {
        int n = points.length;
        PriorityQueue<pair> pq = new PriorityQueue<>((pair a,pair b)->{
            return b.diff - a.diff;
        });
        
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            while(pq.size() > 0 && points[i][0] - pq.peek().x > k){
                pq.remove();
            }
            
            int positiveans = Integer.MIN_VALUE;
            if(pq.size() > 0){
                positiveans = points[i][0] + points[i][1] + pq.peek().diff;
            }
            
            ans = Math.max(ans,positiveans);
            pq.add(new pair(points[i][1] - points[i][0],points[i][0]));
        }
        return ans;
    }
}