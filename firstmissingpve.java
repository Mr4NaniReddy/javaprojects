import java.io.FileReader;
import java.util.*;

public class firstmissingpve{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("The missing first positive is :" +firstmis(arr, n));
        System.out.println(Arrays.toString(arr));

    }

    static int firstmis(int[] arr, int n){
        int i = 0;
        while(i<n){
            int correct = arr[i] - 1;
            if(arr[i] <= 0 || arr[i] >= n){
                i++;
            }
            else if(arr[i] != arr[correct] ){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
            
        }

        for(int j=0;j<n;j++){
            if(arr[j] != j+1){
                return j+1;
            }
        }

        return n+1;
    }

    static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}