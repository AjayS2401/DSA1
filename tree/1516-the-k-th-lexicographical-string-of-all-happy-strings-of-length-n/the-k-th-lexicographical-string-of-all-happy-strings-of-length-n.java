class Solution {

    List<String> res=new ArrayList<>();
    public String getHappyString(int n, int k) {
        String currString="";
        happyB(n,currString);
        if(res.size()<k)
        return "";
        Collections.sort(res);
        return res.get(k-1);
    }
    void happyB(int n,String cs){
        if(cs.length()==n){
            res.add(cs);
            return;
        }
        for(char curchar='a';curchar<='c';curchar++){
            if(cs.length() >0 && cs.charAt(cs.length()-1)==curchar)
            continue;
            happyB(n,cs+curchar);
        }
        
    }

}