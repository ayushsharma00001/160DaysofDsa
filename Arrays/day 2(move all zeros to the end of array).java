class Solution {
    void pushZerosToEnd(int[] arr) {
        int pos = -1;
        for(int i = 0 ; i<arr.length ; i++){
            if(pos==-1 && arr[i]==0)
                pos = i;
            else if(pos != -1 && arr[i]!=0){
                arr[i] = arr[i]+arr[pos] - (arr[pos] = arr[i]);
                pos++;
            }
        }
    }
}