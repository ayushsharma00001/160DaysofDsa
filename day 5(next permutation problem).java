import java.util.*;
class Solution {
    void nextPermutation(int[] arr) {
        int pivot = -1;
        for(int i = arr.length-1 ; i>0 ; i--){
            if(arr[i]>arr[i-1]){
                pivot = i-1;
                break;
            }
        }
        if(pivot == -1){
            Arrays.sort(arr,0,arr.length);
        }
        else{
            int repl = pivot+1;
            for(int i = pivot+2 ; i<arr.length ; i++){
                if(arr[i]>arr[pivot] && arr[i]<arr[repl]){
                    repl = i;
                }
            }
            arr[pivot] = (arr[pivot]+arr[repl]) - (arr[repl] = arr[pivot]);
            Arrays.sort(arr,pivot+1,arr.length);
        }
    }
}