package Recursion;

public class SelectionSort {
    static void selectionsort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){  // i represents the currect element 
            int minIndex = i;
            for(int j =i+1;j<n;j++){    // Find the minimum element in unsorted part of array
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }

            // swap minimum element and current index i element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
    }
    public static void main(String[] args) {
        int[] arr = {67,89,65,3,2,56};
        selectionsort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }

    }
    
}
