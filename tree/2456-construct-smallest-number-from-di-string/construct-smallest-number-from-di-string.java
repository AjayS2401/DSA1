class Solution {
    public String smallestNumber(String pattern) {
        // StringBuilder sb=new StringBuilder();
        // getseq(0,0,pattern.toCharArray(),sb);

        // return sb.reverse().toString();


        //Usign stack

        StringBuilder res=new StringBuilder();
        Stack<Integer> st=new Stack<>();
        for(int idx=0;idx<=pattern.length();idx++){
            st.push(idx+1);
            if(idx==pattern.length() || pattern.charAt(idx)=='I'){
                while(!st.isEmpty()){
                    res.append(st.pop());
                }
            }
        }
        return res.toString();
    }

    // int getseq(int currI,int currCount,char[] pat,StringBuilder res){

    //     if(currI !=pat.length){
    //         if(pat[currI]=='I'){
    //             getseq(currI+1,currI+1,pat,res);
    //         }else {
    //             currCount=
    //             getseq(currI+1,currCount,pat,res);
    //         }
            
    //     }
    //     res=res.append(currCount+1);
    //     return currCount+1;
    // }
}