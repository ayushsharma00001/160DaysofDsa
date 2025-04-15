class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        d = d%arr.length;
        
        for(int i = 0 , j = arr.length-1 ; i<j ; i++, j--){
            arr[i] = arr[i] + arr[j] - (arr[j] = arr[i]);
        }
            
        for(int i = 0, j = arr.length-d-1 ; i<j ; i++,j--){
            arr[i] = arr[i]+arr[j] - (arr[j] = arr[i]);
        }
            
            
        for(int i = arr.length - d , j = arr.length-1 ; i<j ; i++ , j--){
            arr[i] = arr[i]+arr[j] - (arr[j] = arr[i]);
        }
            
    }
}
