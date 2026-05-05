package Recursion;

public class PrintingElementOfArray {
    static void printElem(int[] arr,int idx){
        //base case
        if(idx == arr.length){
            return;
        }

        // self work 
        System.out.println(arr[idx]);

        // recurssive work
        printElem(arr, idx+1);
    }
    
    public static void main(String[] args) {
        int arr[] = {13,56,75,33};
        int index = 0;
        printElem(arr,index);
       
    }
    
    
}
