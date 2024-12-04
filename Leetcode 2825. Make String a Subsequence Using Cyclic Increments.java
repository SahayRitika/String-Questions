class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i=0, idx=0;

        while(i <str1.length() && idx<str2.length()){
        if(str1.charAt(i)== str2.charAt(idx) || (str1.charAt(i)=='z' && str2.charAt(idx)== 'a')){
            i++;
            idx++;
            } else if((int)str1.charAt(i)+1 == (int)str2.charAt(idx)){
                i++;
                idx++;
            } else{
                i++;
            }
        }

        return idx== str2.length();
    }
}
