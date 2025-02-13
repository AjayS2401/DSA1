class Solution {
    int[] cal(String s){
        int l=0;int r=0;
        int n=s.length();
        int z[]=new int[n];
        for(int i=1;i<n;i++){
            int j=i;int k=0;
            if(j>r){
                while(j<n && s.charAt(j)==s.charAt(k))
                {
                    j++;k++;
                }
                z[i]=k;
                l=i;
                r=j-1;
            }
            else{
                if(z[i-l]<r-i+1){
                    z[i]=z[i-l];
                }
                else{
                    j = r+1;
                    k = r-i+1;
                    while(j<n && s.charAt(j)==s.charAt(k)){
                        j++;k++;
                    }
                    z[i] = k;
                    r = j-1;
                    l = i;
                }
            }
        }
        return z;
    }
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
       String s=needle + "&" + haystack;
       
       int[] res=cal(s);
        for(int i=0;i<s.length();i++){
            System.out.println(res[i]);
       }
       for(int i=0;i<res.length;i++){
        if(res[i]==needle.length()){
            return i-needle.length()-1;
        }
       }
    return -1;
    }
}