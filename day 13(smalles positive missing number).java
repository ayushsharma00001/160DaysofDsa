class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        for(int i = 0 ; i<arr.length ; i++){
            while(1<=arr[i] && arr[i]<=arr.length && arr[i]!=arr[arr[i]-1]){
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }
        }
        int num = 1;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]>0 && arr[i]==num){
                num++;
            }
        }
        return num;
    }
}