class Solution {
    static boolean skipOrNot(char ch){
        return ch>='0' && ch<='9';
    }
    public int myAtoi(String s) {
        s= s.trim();
        if(s.length()==0) return 0;
        long number = 0;
        int sign = 1;
        int i = 0;
        if(s.charAt(0) == '-'){
            sign = -1;
            i++;
        }
        for( ; i<s.length() ; i++){
            if(skipOrNot(s.charAt(i))){
                int temp = s.charAt(i) - '0';
                number=number*10+temp;
                if(sign*number>Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
                    
                else if(sign*number<Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
            }
            else{
                return sign*(int)number;
            }
        }
        return sign*(int)number;
    }
}