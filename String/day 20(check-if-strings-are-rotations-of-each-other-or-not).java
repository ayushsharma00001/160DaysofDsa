class Solution {
    static int[] lps(String s){
        int arr[] = new int[s.length()];
        int len = 0;
        int i = 1;
        while(i<s.length()){
            if(s.charAt(len)==s.charAt(i)){
                len++;
                arr[i] = len;
                i++;
            }
            else{
                if(len!=0){
                    len = arr[len-1];
                }
                else{
                    arr[i] = 0;
                    i++;
                }
            }
        }
        return arr;
    }
    static boolean kmpSearch(String text,String pattern){
        int []lps = lps(pattern);
        int i = 0 , j = 0;
        while(i<text.length()){
            if(text.charAt(i)==pattern.charAt(j)){
                i++;
                j++;
                if(j == pattern.length()) return true;
            }else{
                if(j!=0) j = lps[j-1];
                else i++;
            }
        }
        return false;
    }
    public static boolean areRotations(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        String combined = s1+s1;
        return kmpSearch(combined,s2);
    }
}