class Solution {
    public int getLucky(String s, int k) {
        //get the s code
        StringBuilder num= new StringBuilder();
        for(char c: s.toCharArray()){
            num.append(c -'a'+1);
        }

        //perform k transformation
        while(k >0){
            int temp=0;
            for(char x : num.toString().toCharArray()){
                temp+= x-'0'; //Sum of Digits of curr Number
            }

            num= new StringBuilder(String.valueOf(temp));
            k--;
        }

        return Integer.parseInt(num.toString());

    }
}

//more optimised 
class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        for( char x: s.toCharArray()){
            int temp= x- 96;
            while(temp>0){
                int d= temp%10;
                sum+= d;
                temp/= 10;
            }
        }

        k--;
        while(k>0){
            int num=0;
            while(sum>0){
                int d= sum%10;
                num+= d;
                sum/= 10;
            }
            k--;
            sum= num;
        }

        return sum;
    }
}
