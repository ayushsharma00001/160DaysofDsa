class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {

        int totalSum = 0;
        int currMaxSum = 0;
        int currMinSum = 0;
        int maxSum = arr[0];
        int minSum = arr[0];
        for(int i = 1 ; i<arr.length ; i++){
            currMaxSum = Math.max(currMaxSum+arr[i],arr[i]);
            maxSum = Math.max(currMaxSum,maxSum);
            currMinSum = Math.min(currMinSum+arr[i],arr[i]);
            minSum = Math.min(currMinSum,minSum);
            totalSum+=arr[i];
        }
        totalSum+=arr[0];
        if(maxSum<0) return maxSum;
        
        return Math.max(maxSum,totalSum-minSum);
        
    }
}