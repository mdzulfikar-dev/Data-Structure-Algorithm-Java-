package Recursion;

public class ArrayElementSum {
    static int sum(int[] arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }

        int ans = sum(arr,idx+1);
        return arr[idx] + ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int index = 0;
        int result = sum(arr,index);
        System.out.println(result);
    }
    
}
