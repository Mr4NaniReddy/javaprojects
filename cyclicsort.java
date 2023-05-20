import java.util.*;
import java.util.Scanner;

public class cyclicsort{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int  i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("SORTED:");
        sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    
   public static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct])
            {
                swap(arr,i,correct);
            }
            else{
                 i++;
            }
        }
    }
    static void swap(int[] arr, int first, int correct){
        int temp = arr[first];
        arr[first] = arr[correct];
        arr[correct] =temp;
    } 
}