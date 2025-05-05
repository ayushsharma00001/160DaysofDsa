class Solution {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        int freq[] = new int[citations.length+1];
        for(int citation:citations){
            if(citation>=citations.length){
                freq[freq.length-1]++;
            }
            else{
                freq[citation]++;
            }
        }
        int sum = freq[freq.length-1];
        int idx = freq.length-1;
        while(sum<idx){
            idx--;
            sum+=freq[idx];
        }
        return idx;
    }
}