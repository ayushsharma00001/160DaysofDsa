class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        int maxProduct = Integer.MIN_VALUE;
        int productPre = 1, productSuff = 1;
        for(int i = 0 ; i < arr.length ; i++){
            if(productPre == 0) productPre = 1;
            if(productSuff == 0) productSuff = 1;
            productPre = productPre*arr[i];
            productSuff = productSuff*arr[arr.length-i-1];
            maxProduct = Math.max(maxProduct, Math.max(productPre,productSuff));
        }
        return maxProduct;
        
    }
}