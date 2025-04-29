import java.util.*;
class Solution {
    static int[] lps(String a){
        int lps[] = new int[a.length()];
        int len = 0;
        for(int i = 1 ; i<a.length(); i++){
            if(a.charAt(i) == a.charAt(len)){
                len++;
                lps[i] = len;
            }
            else{
                if(len!=0){
                    len = lps[len-1];
                }
                else{
                    lps[i] = 0;
                }
            }
        }
        return lps;
    }
    ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> a1 = new ArrayList<>();
        int lps[] = lps(pat);
        int i = 0 , j = 0;
        while(i<txt.length()){
            if(pat.charAt(j) == txt.charAt(i)){
                i++;
                j++;
            }
            if(j == pat.length()){
                a1.add(i-j);
                j = lps[j-1];
            }
            else if(i<txt.length() && pat.charAt(j)!=txt.charAt(i)){
                if(j!=0){
                    j = lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
        return a1;
    }
}