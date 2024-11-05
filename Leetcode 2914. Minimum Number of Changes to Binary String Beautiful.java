class Solution {
    public int minChanges(String s) {
        int i=0, n=s.length(), ans=0;
        while(i<n-1){
            if(s.charAt(i)==s.charAt(i+1)){
                i+=2;
            }else{
                i+=2;
                ans++;
            }
        }

        return ans;
    }
}
