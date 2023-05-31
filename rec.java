public class rec{
    static int reverse(int n){
        int digits = (int)(Math.log10(n));
        return helper(n,digits);
    }
    static int helper(int n, int digits){
        if(n%10 == n){
            return n;
        }
        return (n%10)*(int)(Math.pow(10,digits)) + helper(n/10,digits-1);
    }
    public static void main(String[] args) {

        System.out.println(reverse(1234));
    }
} 