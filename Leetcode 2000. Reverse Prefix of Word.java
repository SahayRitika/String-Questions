class Solution {
    public String reversePrefix(String word, char ch) {
        int index= word.indexOf(ch);
        if(index!= -1){
            String s= new StringBuffer( word.substring(0,index+1)).reverse().toString();
            //System.out.println(word.substring(0,index+1)+" "+word.substring(index+1));
            String st= word.substring(index+1);
            word= s+st;
        }
        return word;
    }
}
