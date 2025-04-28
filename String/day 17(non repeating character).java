class Solution {
    static char nonRepeatingChar(String s) {
        int arr[] = new int[26];
        for(int i = 0 ; i<s.length() ; i++){
            arr[s.charAt(i)-97]++;
        }
        for(int i = 0 ; i < s.length() ; i++){
            if(arr[s.charAt(i)-97] == 1){
                return s.charAt(i);
            }
        }
        return '$';
    }
}