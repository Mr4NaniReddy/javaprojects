import java.util.*;
public class ftmn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int  i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Missing number is:" + findmissingelement(arr));
        
        
    }
    public static int findmissingelement(int[] arr){
        int i=0;
        int sum = 0;
        int missing;
        while(i<arr.length){
            int correct = arr[i];
            if(correct < arr.length && arr[correct] != arr[i] ){
                swap(arr, i, correct);
            }

            else{
                i++;
            }

        }
        for(int j=0;j<arr.length;j++){
            sum += arr[j];
        }
        missing = (arr.length*(arr.length+1)/2) - sum;


        return missing;
    }
    static void swap(int[] arr, int first, int correct){
        int temp = arr[first];
        arr[first] = arr[correct];
        arr[correct] =temp;
    } 
}
