package Recursion;

public class SumOfAlternativeNumber{
    static int sum(int x){
        if(x==0){
            return x;
        }

        if(x%2==0){
            return sum(x-1)-x;
        }else{
            return sum(x-1)+x;
        }

    
    }
    public static void main(String[] args) {
        int result = sum(5);
        System.out.println(result);
    }
}
