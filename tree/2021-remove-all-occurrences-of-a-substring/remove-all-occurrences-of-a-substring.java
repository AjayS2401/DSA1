class Solution {
    public String removeOccurrences(String s, String part) {
        // while(s.contains(part)){
        //     s=s.replaceFirst(part,"");
        // }
        // return s;

        char[] input=s.toCharArray();
        char[] tar=part.toCharArray();
        int tl=tar.length;
        char[] res=new char[input.length];
        int stackSize=0;
        int tarEndchar=tar[tl-1];

        for(char c:input){
            res[stackSize++]=c;

            if(c==tarEndchar && stackSize>=tl){
                int j=tl-1;int i=stackSize-1;
                while(j>=0 && res[i]==tar[j]){
                    i--;
                    j--;
                }
                if(j<0){
                    stackSize=i+1;
                }
            }
        }
        return new String(res,0,stackSize);
    }
}