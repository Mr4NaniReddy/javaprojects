import java.util.*;
public class goolglequesiton {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int  i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int[] arr2 = findmissing(arr);
        System.out.println("MISSING NUMBERS ARE:");
        System.out.println(Arrays.toString(arr2));
        
        
    }

    static int[] findmissing(int[] arr){
        int[] arr1 = new int[arr.length];
        int i=0;
        
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        int m =0;
        for(int j=0;j<arr.length;j++){
            if(j == arr[j] - 1){
                continue;
            }
            else{
               arr1[m] = j+1;
               m++;
            }
        }
        int[] missing = new int[m];
        for(int k=0;k<m;k++){
            missing[k] = arr1[k];
        }

        return missing;
        
    }

    static void swap(int[] arr, int first, int correct){
        int temp = arr[first];
        arr[first] = arr[correct];
        arr[correct] =temp;
    } 
}

