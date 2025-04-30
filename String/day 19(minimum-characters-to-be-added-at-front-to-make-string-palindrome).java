class Solution {
    static int[] lps(String s){
        int lps[] = new int[s.length()];
        int len = 0;
        int i = 1;
        while(i<s.length()){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len!=0){
                    len = lps[len-1];
                }
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
    public static int minChar(String s) {
        StringBuilder rev = new StringBuilder(s).reverse();
        String newString = s+"$"+rev.toString();
        int lps[] = lps(newString);
        int lastLps = lps[lps.length-1];
        return s.length()-lastLps;
        
    }
}