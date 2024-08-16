class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char c: letters){
            if((int)c > (int)target){
                return c;
            }
        }
        return letters[0];
    }
}
