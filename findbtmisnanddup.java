import java.util.*;

public class findbtmisnanddup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int  i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));  
        
        System.out.println(Arrays.toString(findmisanddup(arr)));
    }

    static int[] findmisanddup(int[] arr){
        int[] arr1 = new int[2];
        int i=0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }

        for(int j=0;j<arr.length;j++){
            if(arr[j] != j+1){
                return new int[] {arr[j],j+1};
            }
        }





        return new int[] {-1,-1};
    }


    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
