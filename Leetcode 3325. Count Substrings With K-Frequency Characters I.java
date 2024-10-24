class Solution {
    public int numberOfSubstrings(String s, int k) {
        int count=0;

        for(int left=0; left<s.length(); left++){
            int frq[]= new int[26];
            for(int right=left; right< s.length(); right++){
                frq[s.charAt(right) - 'a']++;

                if(frq[s.charAt(right) - 'a'] >=k){
                    count+= s.length()- right;
                    break;
                }
            }
        }

        return count;
    }
}
