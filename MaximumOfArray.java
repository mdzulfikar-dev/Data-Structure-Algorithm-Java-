package Recursion;

public class MaximumOfArray {
    static int printMax(int[] arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
      
        int res =  printMax(arr, idx+1);
                int max = Math.max(arr[idx], res);
                return max;

    }
    public static void main(String[] args) {
        int[] arr = {12,45,2100,34,32,400,39};
        int index = 0;
        int result = printMax(arr,index);
        System.out.println(result);
        
    }
    
}
