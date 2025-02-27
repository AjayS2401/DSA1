class Solution {
    int[][] t;
    public int longestCommonSubsequence(String text1, String text2) {
     int m=text1.length();
     int n=text2.length();

     t=new int[m+1][n+1];
     for(int[] row:t){
        Arrays.fill(row,-1);
     }
        return lcs(text1,text2,m,n);

    }
    int lcs(String s1,String s2,int m,int n){

    if(m==0 || n==0)
    return t[m][n]=0;

    if(t[m][n]!=-1)
    return t[m][n];

        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return t[m][n]=1+lcs(s1,s2,m-1,n-1);
        }
            return t[m][n]=Math.max(lcs(s1,s2,m-1,n),lcs(s1,s2,m,n-1));
    

    }
}