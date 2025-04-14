class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = -1;
        int sMax = -1;
        for(int i = 0 ; i<arr.length ; i++){
            if(max<arr[i]){
                sMax = max;
                max = arr[i];
            }
            else if(sMax<arr[i] && arr[i]!=max)
                sMax = arr[i];
        }
        return sMax;
    }
}