import java.util.Arrays;
class Solution {
    static int minRemoval(int intervals[][]) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1],b[1]));
        int count = 0;
        int prevEnd = Integer.MIN_VALUE;
        for(int interval[]:intervals){
            if(interval[0]>=prevEnd)
                prevEnd = interval[1];
            else
                count++;
        }
        return count;
    }
}