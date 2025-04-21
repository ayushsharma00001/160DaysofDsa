class Solution {
    int maxSubarraySum(int[] arr) {
        int largestSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i<arr.length ; i++){
            sum+=arr[i];
            largestSum = largestSum>sum?largestSum:sum;
            if(sum<0) sum = 0;
        }
        return largestSum;
    }
}