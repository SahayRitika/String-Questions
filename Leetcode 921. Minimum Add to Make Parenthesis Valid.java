class Solution {
    public int minAddToMakeValid(String s) {
        int opening=0, closing=0;
        for(var c: s.getBytes()){
            if(c =='('){
                opening++;
            }else{
                if(opening >0){
                    opening--;
                }else{
                    closing++;
                }
            }
        }

        return opening+closing;
    }
}
