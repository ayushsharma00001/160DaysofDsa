class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        if(arr.length<=1){
            return Arrays.asList(arr);
        }
        
        Arrays.sort(arr,(a,b)-> Integer.compare(a[0],b[0]));
        
        List<int[]> merged = new ArrayList<>();
        int current[] = arr[0];
        merged.add(current);
        
        for(int[] next:arr){
            int currentEnd = current[1];
            int nextStart = next[0];
            int nextEnd = next[1];
            if(nextStart<=currentEnd){
                current[1] = Math.max(currentEnd,nextEnd);
            }else{
                current = next;
                merged.add(current);
            }
        }
        return merged;
    }
}