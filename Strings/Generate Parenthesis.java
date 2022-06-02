class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        answer(n,ans,0,0,"");
        return ans;
    }
    
    public static void answer(int n,List<String> ans,int start,int end,String str){
        if(start == n && end == n){
            ans.add(str);
            return;
        }
        if(start < n){
            answer(n,ans,start+1,end,str+"(");
        }
        if(end < start){
            answer(n,ans,start,end+1,str+")");
        }
    }
}