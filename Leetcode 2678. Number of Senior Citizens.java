class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(String s: details){
            String sb= s.substring(11,13);
            int a= Integer.valueOf(sb);
            //System.out.println(a);
            if(a>60){ c++;}
        }

        return c;
    }
}
