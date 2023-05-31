public class linersearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(linear(arr, 8, 0));
    }

    static boolean linear(int[] arr,int target,int index){
        if(index >= arr.length){
            return false;
        }
        return (arr[index] == target || linear(arr, target, index+1));
        
    }
}
