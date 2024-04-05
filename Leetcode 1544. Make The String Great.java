class Solution {
    public String makeGood(String s) {
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && Math.abs((int)ch-(int)st.peek())==32){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        String ans="";
        while(!st.isEmpty()){
            char ch=st.pop();
            ans=ch+ans;
        }
        return ans;
    }
}
