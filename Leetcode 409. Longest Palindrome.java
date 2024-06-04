class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map= new HashMap<>();
        for(int i=0;i <s.length(); i++){
            char ch= s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        //System.out.println(map);

        int ans=0, f=0;
        for(Map.Entry<Character, Integer> set : map.entrySet()){
            int freq= set.getValue();
            if(freq%2 ==0){
                ans+= freq;
            }else{
                ans+= (freq/2)* 2;
            }
            freq%= 2;
            if(f!=1 && freq>0){
                ans+=1;
                f=1;
            }
        }

        return ans;
    }
}
