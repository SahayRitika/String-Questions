//first Approach
class Solution {
    public int minimumPushes(String word) {
        int freq[]= new int[26];

        //Store frquencies of characters
        for(int i=0; i<word.length(); i++){
            char c= word.charAt(i);
            freq[c-'a']++;
        }

        //Boxing since Xollections.reverseOrder requires Wrapper class
        Integer[] arrInt = Arrays.stream(freq).boxed().toArray(Integer[]::new);
        // sort feqs in descending order
        Arrays.sort(arrInt, Collections.reverseOrder());
        System.out.println(Arrays.toString(arrInt));
        int i=0,c=1,multi=1,ans=0;
        while(i<26 && arrInt[i]!=0){
            ans+= arrInt[i]*multi;
            c++;
            if(c>8){
                c=1;
                multi++;
            }
            i++;
        }
       
        return ans;
    }
}

//moreoptimised
class Solution {
    public int minimumPushes(String word) {
        int count[]= new int[26];
        int ans=0;
        //Store frequices of characters
        for(char ch: word.toCharArray()){
            count[ch-'a']++;
        }

        Arrays.sort(count);

        for(int i=0;i<count.length;i++){
            ans+= count[26-i-1]* (i/8+1);
        }

        return ans;

    }
}
