class Solution {
    public int minOperations(String[] logs) {
        int moves=0;
       for( String s: logs){
        if(Character.isLetterOrDigit(s.charAt(0))){
            moves++;
        }
        if(s.equals("../") && moves>0){
            moves--;
        }
       }
       return moves; 
    }
}
