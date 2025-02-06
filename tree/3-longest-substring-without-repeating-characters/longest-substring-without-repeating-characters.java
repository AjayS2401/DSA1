class Solution {
    public int lengthOfLongestSubstring(String s) {
    HashMap<Character,Integer> hm= new HashMap<>();
    int longest=0;
    int start=0;
    for(int end=0;end<s.length();end++){
        if(hm.containsKey(s.charAt(end))){
            start=Math.max(start,hm.get(s.charAt(end))+1);
        }
        hm.put(s.charAt(end),end);
        longest=Math.max(longest,end-start+1);
    }        
    return longest;
    }
}