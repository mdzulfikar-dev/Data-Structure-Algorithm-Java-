package Recursion;


public class BubbleSort {
    static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            boolean  flag = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
                if(!flag){   // has nay swap happened
                    return;

                }
                
            }
        }
    }
    public static void main(String[] args) {
        // int[]  arr = {23,76,1,46,6,78};
        int[]  arr1 = {1,2,3,4,5,6,7};
        bubbleSort(arr1);

        for(int elem:arr1){
            System.out.println(elem +" ");
        }

      
         
        
    }
    
}
