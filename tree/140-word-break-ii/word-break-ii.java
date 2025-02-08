class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        HashSet<String> hs=new HashSet<>(wordDict);
        int n=s.length();
        List<String> res=new ArrayList<>();
        boolean[] dp=new boolean[n+1];
        dp[0]=true;
      
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                if(dp[j] && hs.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }

        if(dp[n]){
            backtrack(s,n,hs,new ArrayList<>(),res,dp);
        }
        return res;
    }
    void backtrack(String s,int index,HashSet<String> hs, ArrayList<String> path,List<String> res,boolean[] dp){
        if(index==0){
            StringBuilder sb=new StringBuilder();
            for(int i=path.size()-1;i>=0;i--){
                sb.append(path.get(i));
                if(i>0){
                        sb.append(" ");
                }
            }
            res.add(sb.toString());
            return;
        }
        for(int i=index-1;i>=0;i--){
            if(dp[i] && hs.contains(s.substring(i,index))){
                path.add(s.substring(i,index));
                backtrack(s,i,hs,path,res,dp);
                path.remove(path.size()-1);
            }
        }
    }
}