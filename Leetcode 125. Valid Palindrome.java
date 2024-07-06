class Solution {
    public boolean isPalindrome(String s) {
        int start=0, end=s.length()-1;
        while(start<=end){
            char firstChar= s.charAt(start);
            char lastChar= s.charAt(end);
            if(!Character.isLetterOrDigit(firstChar)){
                start++;
            }else if(!Character.isLetterOrDigit(lastChar)){
                end--;
            }else{
                if(Character.toLowerCase(firstChar) != Character.toLowerCase(lastChar)){
                    return false;
                }
                start++;
                end--;
            }
        }

        return true;
    }
}
