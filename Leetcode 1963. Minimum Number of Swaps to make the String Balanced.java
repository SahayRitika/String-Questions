//optimised approach
class Solution {
    public int minSwaps(String s) {
        int opening=0;
        int unbalanced=0;
        for(var c:s.getBytes()){
            if(c== '['){
                opening++;
            }else{
                if(opening >0){
                    opening--;
                }else{
                    unbalanced++;
                }
            }
        }

        return (unbalanced +1)/2;
    }
}

//navie approach
class Solution {
    public int minSwaps(String s) {
        int size=0;
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            if(c =='['){
                size++;
            }else if(size>0){
                size--;
            }
        }

        return (size+1)/2;
    }
}
