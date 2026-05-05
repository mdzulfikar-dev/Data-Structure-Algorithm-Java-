package Recursion;

public class iGCD {
    static int gcd(int x, int y){
        if(y == 0){
            return x;
        }

        return gcd(y,x%y);
    }
    public static void main(String[] args) {
        int result = gcd(24,15);
        System.out.println(result);
        
    }

    
}
