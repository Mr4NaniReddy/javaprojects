public class countzero{
    static int count = 0;
    // static int countz(int n){
    //     int count = 0;
    //     return helper(n,count);
    // }
    static int helper(long n){

        if(n%10 == 0){
            count += 1;
        }
        if(n<10){
            return -1;
        }
        return helper(n/10);
    }
    public static void main(String[] args) {
        helper(302050000);
        System.out.println(count);
    }
}