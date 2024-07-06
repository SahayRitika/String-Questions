class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        int sIndex=0, tIndex=0;
        while(tIndex <t.length()){
            if(s.charAt(sIndex) == t.charAt(tIndex)){
                //System.out.println(s.charAt(sIndex));
                sIndex++;
            }
            if(sIndex==s.length()){
                return true;
            }
            tIndex++;
        }
        return false;
    }
}
