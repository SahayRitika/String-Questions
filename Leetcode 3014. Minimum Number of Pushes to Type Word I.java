//first approach
class Solution {
    public int minimumPushes(String word) {
        int freq[]= new int[26];
        int ans=0;

        //Store freqies of each character
        for(char c: word.toCharArray()){
            freq[c- 'a']++;
        }

        Arrays.sort(freq);
        for(int i=0; i<freq.length; i++){
            ans+= freq[26-i-1] * (i/8+1);
        }

        return ans;

    }
}

//more optimised
//Since elements are unique in this Array we don't have to calculate fequiencies of characters
class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int ans=0;
        while(n>0){
            ans+= n;
            n-=8;
        }

        return ans;
    }
}
