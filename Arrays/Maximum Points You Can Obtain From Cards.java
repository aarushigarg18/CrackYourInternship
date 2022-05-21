class Solution {
    public int maxScore(int[] cards, int k) {
        int n = cards.length;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += cards[i];
        }
        
        int max = sum;
        for(int i=0;i<k;i++){
            sum = sum - cards[k-i-1] + cards[n-1-i];
            max = Math.max(max,sum);
        }
        return max;
    }
}