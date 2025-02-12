class Solution {
    public String clearDigits(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
           char c=s.charAt(i);
            if(Character.isDigit(c)){
               if (!st.isEmpty()) {
                    st.pop();
                }
            }
            else{
                st.push(c);
            }
        }
            StringBuilder sb=new StringBuilder();
            while(!st.isEmpty()){
                sb.append(st.pop());
            }
            return sb.reverse().toString();
    }
}