class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder sb=new StringBuilder();
        getseq(0,0,pattern.toCharArray(),sb);

        return sb.reverse().toString();
    }

    int getseq(int currI,int currCount,char[] pat,StringBuilder res){

        if(currI !=pat.length){
            if(pat[currI]=='I'){
                getseq(currI+1,currI+1,pat,res);
            }else {
                currCount=
                getseq(currI+1,currCount,pat,res);
            }
            
        }
        res=res.append(currCount+1);
        return currCount+1;
    }
}