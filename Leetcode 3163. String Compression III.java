class Solution {
    public String compressedString(String word) {
        StringBuilder sb= new StringBuilder();
        int count=1, n=word.length();
        char ch= word.charAt(0);
        for(int i=1; i<n; i++){
            if(word.charAt(i)==ch && count<9){
                count++;
            }else{
                sb.append(count).append(ch);
                ch=word.charAt(i);
                count=1;
            }
        }
        sb.append(count).append(ch);
        return sb.toString();
    }
}
