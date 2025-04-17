import java.util.*;
class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] arr) {
        Arrays.sort(arr);
        List<Integer> l1 = new ArrayList<>();
        int count = 1;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }
            else{
                if(count>arr.length/3){
                    l1.add(arr[i-1]);
                }
                count = 1;
            }
        }
        if(count>arr.length/3){
            l1.add(arr[arr.length-1]);
        }
        return l1;
    }
}
