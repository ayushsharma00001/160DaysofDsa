class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        int arr2[] = new int[3];
        for(int i = 0 ; i<arr.length ; i++){
            arr2[arr[i]]++;
        }
        int i = 0;
        while(i<arr.length){
            if(arr2[0]!=0){
                arr[i] = 0;
                arr2[0]--;
                i++;
            }
            else if(arr2[1]!=0){
                arr[i] = 1;
                arr2[1]--;
                i++;
            }
            else{
                arr[i] = 2;
                i++;
            }
        }
        
    }
}