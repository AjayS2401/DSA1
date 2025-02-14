class Solution {
    public int findTheWinner(int n, int k) {
        if(n==1)
        return n;
        int i=1;int last_idx=0;
        while(i<=n){
            last_idx=(last_idx+k)%i;
            i++;
        }
        return last_idx+1;
    }
}