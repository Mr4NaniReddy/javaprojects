public class palin {

static int palindrome(int n){
    if (n == rev(n)){
        return 1;
    }
    return -1;
 }

 static int rev(int n){
    int digits = (int)(Math.log10(n));
    return helper(n,digits);
 }
 static int helper(int n,int digits){
    if(n%10 == n){
        return n;
    }

    return (n%10)*(int)(Math.pow(10,digits)) + helper(n/10, digits-1); 
 }

 public static void main(String[] args) {
    System.out.println(palindrome(1231));
 }   
}
