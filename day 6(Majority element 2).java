import java.util.*;
class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> l1 = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > nums.length/3){
                l1.add(entry.getKey());
            }
        }
        Collections.sort(l1);
        return l1;
    }
}