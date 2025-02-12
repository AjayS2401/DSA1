class Solution {
    public String shortestPalindrome(String s) {
        int n=s.length();
        int i=0;
        int j=n-1;
        while(j>=0){
            if(s.charAt(i)==s.charAt(j)){
                i++;
            }
            j--;
        }

        String remain=s.substring(i,n);
        StringBuilder sb=new StringBuilder(remain);
        if(remain.length()==0)
        return s;

        StringBuilder rev_remain=sb.reverse();

        return rev_remain.toString()+shortestPalindrome(s.substring(0,i))+ remain;
    }
}