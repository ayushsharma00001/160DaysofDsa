class Solution {
    public void reverseArray(int arr[]) {
        for(int i = 0 , j = arr.length-1 ; i<j ; i++,j--){
            arr[i] = arr[i]+arr[j] - (arr[j] = arr[i]);
        }
    }
}