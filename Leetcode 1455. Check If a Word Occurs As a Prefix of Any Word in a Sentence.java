class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String words[]= sentence.split(" ");
        int ans=-1;
        for(int i=0; i<words.length; i++){
            if(words[i].indexOf(searchWord) != -1 && words[i].indexOf(searchWord)==0){
                ans= i+1;
                break;
            }
        }

        return ans;
    }
}
