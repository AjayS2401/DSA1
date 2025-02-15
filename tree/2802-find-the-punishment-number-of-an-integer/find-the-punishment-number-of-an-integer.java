class Solution {
    public int punishmentNumber(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(punish(i))
            sum+=i*i;
        }
        return sum; 
    }

    boolean punish(int i){
        String sq=String.valueOf(i*i);
       return backTrack(sq,0,0,i);
    }
    boolean backTrack(String sq,int idx,int curSum,int tar){
            if(idx==sq.length())
            return curSum==tar;

        for(int j=idx+1;j<=sq.length();j++){
            int num=Integer.parseInt(sq.substring(idx,j));
           if( backTrack(sq,j,curSum+num,tar))
           return true;
        }    
        return false;
    }

}
