class Solution {
    void pushZerosToEnd(int[] arr) {
        int pos = -1;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]==0 && pos== -1)
                pos = i;
            else if(pos!=-1 && arr[pos]==0 && arr[i]!=0){
                arr[i] = arr[i]+arr[pos] - (arr[pos] = arr[i]);
                pos++;
            }
        }
    }
}