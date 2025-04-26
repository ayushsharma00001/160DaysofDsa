class Solution {
    public String addBinary(String s1, String s2) {
        String ans = "";
        int carry = 0;
        for(int i = s1.length()-1 , j = s2.length()-1 ; i>=0||j>=0;i--,j-- ){
            if(i>=0 && j>=0){
                int sum = s1.charAt(i)-'0'+s2.charAt(j)-'0'+carry;
                ans+=sum%2;
                carry = sum/2;
            }
            else if(i>=0){
                int sum = s1.charAt(i)-'0'+carry;
                ans+=sum%2;
                carry = sum/2;
            }
            else{
                int sum = s2.charAt(j)-'0'+carry;
                ans+=sum%2;
                carry = sum/2;
            }
        }
        if(carry == 1){
            ans+=carry;
        }
        ans = new StringBuilder(ans).reverse().toString();
        ans = ans.replaceFirst("^0+","");
        return ans;
    }
}