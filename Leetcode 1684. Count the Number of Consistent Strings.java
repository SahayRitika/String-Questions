class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(String word: words){
            for(int i=0; i<word.length(); i++){
                if(allowed.indexOf(word.charAt(i)) ==-1){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        return (words.length-count);
    }
}

//optimised appraoch
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] s= new boolean[26];
        for(char c: allowed.toCharArray()){
            s[c - 'a']= true;
        }
        int count=0;
        for(String word: words){
            if(check(word, s))
            count++;
        }

        return count;
    }

    public boolean check(String w, boolean[] s){
        for(int i=0; i<w.length(); i++){
            char c= w.charAt(i);
            if(!s[c -'a'])
            {
                return false;
            }
        }

        return true;
    }
}
