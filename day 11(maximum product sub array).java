class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        int maxProduct = arr[0];
        int currMax = arr[0];
        int currMin = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i]<0){
                currMax = currMax+currMin - (currMin = currMax);
            }
            currMax = Math.max(arr[i],arr[i]*currMax);
            currMin = Math.min(arr[i],arr[i]*currMin);
            maxProduct = Math.max(maxProduct,currMax);
        }
        return maxProduct;
        
    }
}